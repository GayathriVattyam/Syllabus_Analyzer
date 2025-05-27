package com.example.syllabusAnalyzer.Repositories;

import com.example.syllabusAnalyzer.Users.AIpredictDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AIpredictRepositories extends JpaRepository<AIpredictDetails, Long> {
}
