package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Users.UserProgressDetails;
import com.example.syllabusAnalyzer.Repositories.UserProgressRepositories;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProgressServices {

    @Autowired
    private UserProgressRepositories repo;

    public void saveProgress(UserProgressDetails progress) {
        repo.save(progress);
    }

    public UserProgressDetails getProgress(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Progress with ID " + id + " not found"));
    }

    public void deleteProgress(Long id) {
        repo.deleteById(id);
    }

    public UserProgressDetails updateProgress(UserProgressDetails progress) {
        UserProgressDetails existing = repo.findById(progress.getPro_id())
                .orElseThrow(() -> new ResourceNotFoundException("Progress with ID " + progress.getPro_id() + " not found"));

        existing.setUser_id(progress.getUser_id());
        existing.setTopic_id(progress.getTopic_id());
        existing.setComplete_subtopic(progress.getComplete_subtopic());
        existing.setTotal_subtopic(progress.getTotal_subtopic());
        existing.setLast_updated(progress.getLast_updated());

        return repo.save(existing);
    }

    public List<UserProgressDetails> getAllProgress() {
        return repo.findAll();
    }
}
