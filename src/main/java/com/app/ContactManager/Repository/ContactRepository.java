package com.app.ContactManager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ContactManager.Entity.Contact;
import com.app.ContactManager.Entity.User;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    // This finds all contacts that belong to a specific User.
    // It prevents User A from seeing User B's contacts.
    List<Contact> findByUser(User user);
}
