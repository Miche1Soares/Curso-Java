package com.example.springboot_mongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_mongo.domain.Post;
import com.example.springboot_mongo.repository.PostRepository;
import com.example.springboot_mongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    

    @Autowired
    private PostRepository repo;
    
    public Post findById(String id)
    {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
