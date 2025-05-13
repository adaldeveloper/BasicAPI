package com.devspring.dev.controllers;

import com.devspring.dev.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @GetMapping ("/{id}")
    public User getUser(@PathVariable long userId) {



        return null;
    }

    @PostMapping
    public void createUser(@RequestBody User newUser) {

    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable long id,@RequestBody User user) {

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id) {
    return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        return null;
    }



}
