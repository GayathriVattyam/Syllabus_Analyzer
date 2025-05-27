package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Services.ProHistoryServices;
import com.example.syllabusAnalyzer.Users.ProHistoryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/progress-history")
public class ProHistoryController {

    @Autowired
    private ProHistoryServices serv;

    @PostMapping("/save")
    public void save(@RequestBody ProHistoryDetails history) {
        serv.save(history);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ProHistoryDetails> get(@PathVariable Long id) {
        return ResponseEntity.ok(serv.get(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        serv.delete(id);
    }

    @PutMapping("/update")
    public ResponseEntity<ProHistoryDetails> update(@RequestBody ProHistoryDetails history) {
        return ResponseEntity.ok(serv.update(history));
    }

    @GetMapping("/all")
    public List<ProHistoryDetails> getAll() {
        return serv.getAll();
    }
}
