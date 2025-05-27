package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Users.TopicDetails;
import com.example.syllabusAnalyzer.Services.TopicsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/topics")
public class TopicsController {

    @Autowired
    private TopicsServices serv;

    @PostMapping("/save")
    public void save(@RequestBody TopicDetails topic) {
        serv.saveTopic(topic);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TopicDetails> get(@PathVariable Long id) {
        return ResponseEntity.ok(serv.getTopic(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        serv.deleteTopic(id);
    }

    @PutMapping("/update")
    public ResponseEntity<TopicDetails> update(@RequestBody TopicDetails topic) {
        return ResponseEntity.ok(serv.updateTopic(topic));
    }
}
