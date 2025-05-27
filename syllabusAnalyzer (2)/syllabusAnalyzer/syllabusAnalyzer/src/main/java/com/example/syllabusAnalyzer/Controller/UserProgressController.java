package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Users.UserProgressDetails;
import com.example.syllabusAnalyzer.Services.UserProgressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/userprogress")
public class UserProgressController {

    @Autowired
    private UserProgressServices service;

    @PostMapping("/save")
    public void save(@RequestBody UserProgressDetails progress) {
        service.saveProgress(progress);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserProgressDetails> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getProgress(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProgress(id);
    }

    @PutMapping("/update")
    public ResponseEntity<UserProgressDetails> update(@RequestBody UserProgressDetails progress) {
        return ResponseEntity.ok(service.updateProgress(progress));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserProgressDetails>> getAll() {
        return ResponseEntity.ok(service.getAllProgress());
    }
}
