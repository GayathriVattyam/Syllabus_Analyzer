package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Repositories.ProHistoryRepositories;
import com.example.syllabusAnalyzer.Users.ProHistoryDetails;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProHistoryServices {

    @Autowired
    private ProHistoryRepositories repo;

    public void save(ProHistoryDetails history) {
        history.setDate(new Date()); // set date if not provided
        repo.save(history);
    }

    public ProHistoryDetails get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("History not found with ID: " + id));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public ProHistoryDetails update(ProHistoryDetails history) {
        ProHistoryDetails existing = get(history.getHis_id());

        existing.setUser_id(history.getUser_id());
        existing.setTop_id(history.getTop_id());
        existing.setDate(history.getDate());
        existing.setComplete_subtopic(history.getComplete_subtopic());
        existing.setTotal_subtopic(history.getTotal_subtopic());

        return repo.save(existing);
    }

    public List<ProHistoryDetails> getAll() {
        return repo.findAll();
    }
}
