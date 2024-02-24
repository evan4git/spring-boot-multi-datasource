package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserService {

    private final UserRepository userRepository;
    @PersistenceContext(unitName = "secondaryEntityManagerFactory")
    private EntityManager entityManager;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Method for writing to the master database
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Method for reading from the secondary database
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }
}

