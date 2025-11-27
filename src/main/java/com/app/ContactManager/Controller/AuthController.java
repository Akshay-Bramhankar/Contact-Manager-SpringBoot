package com.app.ContactManager.Controller;

import com.app.ContactManager.Entity.User;
import com.app.ContactManager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder; // <--- This is the key!

    // Show Login Page
    @GetMapping("/login")
    public String login() {
        return "login"; // Refers to login.html
    }

    // Show Signup Page
    @GetMapping("/signup")
    public String signup() {
        return "signup"; // Refers to signup.html
    }

    // Handle Registration Logic
    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        
        // 1. Debugging: Add this line to see if the code actually runs!
        System.out.println("Registering user: " + user.getUsername()); 

        // 2. Encryption (Crucial!)
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");

        // 3. THIS IS THE MOST IMPORTANT LINE
        userRepo.save(user); 

        return "redirect:/login?success";
    }
    
//    @PostMapping("/register")
//    public String register(@ModelAttribute User user) {
//        // 1. Check if username already exists
//        if (userRepo.findByUsername(user.getUsername()) != null) {
//            return "redirect:/signup?error";
//        }
//
//        // 2. ENCRYPT the password before saving
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        
//        // 3. Set default role
//        user.setRole("USER");
//
//        // 4. Save to DB
//        userRepo.save(user);
//
//        return "redirect:/login?success";
//    }
}