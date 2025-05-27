package com.example.syllabusAnalyzer.Services;

import com.example.syllabusAnalyzer.Users.AIpredictDetails;
import com.example.syllabusAnalyzer.Repositories.AIpredictRepositories;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIpredictServices {

    @Autowired
    private AIpredictRepositories repo;

    public void savePrediction(AIpredictDetails pred) {
        repo.save(pred);
    }

    public AIpredictDetails getPrediction(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new ResourceNotFoundException("Prediction not found with id " + id));
    }

    public void deletePrediction(Long id) {
        repo.deleteById(id);
    }

    public AIpredictDetails updatePrediction(AIpredictDetails pred) {
        AIpredictDetails existing = repo.findById(pred.getPred_id())
            .orElseThrow(() -> new ResourceNotFoundException("Prediction not found with id " + pred.getPred_id()));

        existing.setUser_id(pred.getUser_id());
        existing.setTop_id(pred.getTop_id());
        existing.setPred_table(pred.getPred_table());
        existing.setPred_comp(pred.getPred_comp());
        existing.setPred_horizon(pred.getPred_horizon());
        existing.setCreatedAt(pred.getCreatedAt());

        return repo.save(existing);
    }
}
