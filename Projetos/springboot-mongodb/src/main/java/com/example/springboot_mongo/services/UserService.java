package com.example.springboot_mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_mongo.domain.User;
import com.example.springboot_mongo.repository.UserRepository;

@Service
public class UserService {
    

    @Autowired
    private UserRepository repo;
    
    public List<User> findAll()
    {
        return repo.findAll();
    }

}
