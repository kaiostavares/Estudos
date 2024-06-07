package com.kaio.estudos_SpringWeb.controller;

import com.kaio.estudos_SpringWeb.model.User;
import com.kaio.estudos_SpringWeb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping()
    public void post(@RequestBody User usuario){
        repository.save(usuario);
    }
    @PutMapping()
    public void put(@RequestBody User usuario){
        repository.update(usuario);
    }
    @GetMapping()
    public List<User> getAll(){
        return repository.listAll();
    }
    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
