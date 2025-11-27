package com.app.ContactManager.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // <--- CRITICAL FIX: Use Spring UI Model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.ContactManager.Entity.Contact;
import com.app.ContactManager.Entity.User;
import com.app.ContactManager.Repository.ContactRepository;
import com.app.ContactManager.Repository.UserRepository;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepo;
    
    @Autowired
    private UserRepository userRepo;

    // View All Contacts
    @GetMapping("/contacts")
    public String viewContacts(Model model, Principal principal) {
        // 1. Check if principal is null (Shouldn't happen if logged in, but good safety)
        if (principal == null) {
            return "redirect:/login";
        }

        String username = principal.getName();
        User user = userRepo.findByUsername(username);
        
        // 2. SAFETY CHECK: Did we find the user in the DB?
        if (user == null) {
            return "redirect:/logout"; // Something is wrong, log them out
        }

        model.addAttribute("contacts", contactRepo.findByUser(user));
        return "contact-list"; 
    }

    // Add Contact
    @PostMapping("/contacts/add")
    public String addContact(@ModelAttribute Contact contact, Principal principal) {
        String username = principal.getName();
        User user = userRepo.findByUsername(username);
        contact.setUser(user);
        contactRepo.save(contact);
        return "redirect:/contacts";
    }

    // Delete Contact
    @GetMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable Long id) {
        contactRepo.deleteById(id);
        return "redirect:/contacts";
    }
    
    @PostMapping("/contacts/update")
    public String updateContact(@ModelAttribute Contact contact, Principal principal) {
        // 1. Get the current user
        String username = principal.getName();
        User user = userRepo.findByUsername(username);
        
        // 2. IMPORTANT: Link the contact back to the user 
        // (otherwise the contact becomes "orphaned" or the update fails)
        contact.setUser(user);
        
        // 3. Save (Since 'id' is present in the form, JPA will UPDATE, not Insert)
        contactRepo.save(contact);
        
        return "redirect:/contacts";
    }
}