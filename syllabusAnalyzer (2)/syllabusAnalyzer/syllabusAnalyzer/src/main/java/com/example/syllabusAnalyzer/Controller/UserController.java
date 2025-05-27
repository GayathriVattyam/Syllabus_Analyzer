package com.example.syllabusAnalyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.syllabusAnalyzer.Services.UserServices;
import com.example.syllabusAnalyzer.Users.UserDetails;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices serv;

    @PostMapping("/save")
    public void saveUser(@RequestBody UserDetails user) {
        serv.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserDetails> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(serv.getUser(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        serv.deleteUser(id);
    }

    @PutMapping("/update")
    public ResponseEntity<UserDetails> update(@RequestBody UserDetails user) {
        return ResponseEntity.ok(serv.updateUser(user));
    }
}
