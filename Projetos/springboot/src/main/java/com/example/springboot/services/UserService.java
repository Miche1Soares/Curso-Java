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


    // inserindo usuario
    public User insert(User obj)
    {
        return repository.save(obj);
    }


    // deletando um usuario
    public void delete(Long id)
    {
        repository.deleteById(id);
    }


    // atualizando um usuario
    public User update(Long id, User obj)
    {
        //                       diferente do findById (que vai no banco de dados e traz o "objeto") o getReferenceById só prepara um objeto para realizar alterações e dps enviar ao database
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) 
    {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
