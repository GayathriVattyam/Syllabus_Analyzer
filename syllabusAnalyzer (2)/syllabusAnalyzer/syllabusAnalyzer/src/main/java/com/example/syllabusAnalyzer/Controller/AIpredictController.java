package com.example.syllabusAnalyzer.Controller;

import com.example.syllabusAnalyzer.Users.AIpredictDetails;
import com.example.syllabusAnalyzer.Services.AIpredictServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/aipredictions")
public class AIpredictController {

    @Autowired
    private AIpredictServices service;

    @PostMapping("/save")
    public void save(@RequestBody AIpredictDetails pred) {
        service.savePrediction(pred);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AIpredictDetails> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getPrediction(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePrediction(id);
    }

    @PutMapping("/update")
    public ResponseEntity<AIpredictDetails> update(@RequestBody AIpredictDetails pred) {
        return ResponseEntity.ok(service.updatePrediction(pred));
    }
}
