package com.example.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entities.User;
import com.example.springboot.repositories.UserRepository;

// para o autowired do userresource funcionar
@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll()
    {
        return repository.findAll();
    }

    public User findById(Long id)
    {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
