package com.app.ContactManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ContactManager.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // Spring Boot automatically generates the SQL for this method 
    // based on the method name "findByUsername"
    User findByUsername(String username);
}
