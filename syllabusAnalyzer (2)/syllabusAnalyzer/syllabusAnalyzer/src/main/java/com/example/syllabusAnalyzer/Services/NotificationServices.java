package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Repositories.NotificationRepositories;
import com.example.syllabusAnalyzer.Users.NotificationDetails;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotificationServices {

    @Autowired
    private NotificationRepositories repo;

    public void saveNotification(NotificationDetails notify) {
        notify.setCreated_at(new Date()); // Set current date if needed
        repo.save(notify);
    }

    public NotificationDetails getNotification(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Notification not found with ID: " + id));
    }

    public void deleteNotification(Long id) {
        repo.deleteById(id);
    }

    public NotificationDetails updateNotification(NotificationDetails notify) {
        NotificationDetails existing = getNotification(notify.getNotify_id());

        existing.setUser_id(notify.getUser_id());
        existing.setMessage(notify.getMessage());
        existing.setIs_read(notify.isIs_read());
        existing.setCreated_at(notify.getCreated_at());  // Optional, based on use-case

        return repo.save(existing);
    }

    public List<NotificationDetails> getAllNotifications() {
        return repo.findAll();
    }
}
