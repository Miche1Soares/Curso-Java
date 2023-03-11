package com.example.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll()
    {
        User u = new User(1L, "Magno", "magno@gmail.com", "123456578", "senha123");
        return ResponseEntity.ok().body(u);
    }

}
