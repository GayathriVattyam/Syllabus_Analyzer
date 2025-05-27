package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Users.NotificationDetails;
import com.example.syllabusAnalyzer.Services.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationServices serv;

    @PostMapping("/save")
    public void saveNotification(@RequestBody NotificationDetails notify) {
        serv.saveNotification(notify);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<NotificationDetails> getNotification(@PathVariable Long id) {
        return ResponseEntity.ok(serv.getNotification(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNotification(@PathVariable Long id) {
        serv.deleteNotification(id);
    }

    @PutMapping("/update")
    public ResponseEntity<NotificationDetails> updateNotification(@RequestBody NotificationDetails notify) {
        return ResponseEntity.ok(serv.updateNotification(notify));
    }

    @GetMapping("/all")
    public List<NotificationDetails> getAllNotifications() {
        return serv.getAllNotifications();
    }
}
