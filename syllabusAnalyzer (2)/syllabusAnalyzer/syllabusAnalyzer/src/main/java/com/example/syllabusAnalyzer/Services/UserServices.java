package com.example.syllabusAnalyzer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syllabusAnalyzer.Repositories.UserRepositories;
import com.example.syllabusAnalyzer.Users.UserDetails;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;

@Service
public class UserServices {

    @Autowired
    private UserRepositories repo;

    public void saveUser(UserDetails user) {
        repo.save(user);
    }

    public UserDetails getUser(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
    }

    public void deleteUser(Long id) {
        repo.delete(getUser(id));
    }

    public UserDetails updateUser(UserDetails user) {
        UserDetails existingUser = getUser(user.getUser_id());

        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setRole(user.getRole());
        existingUser.setCreatedAt(user.getCreatedAt());

        return repo.save(existingUser);
    }
}
