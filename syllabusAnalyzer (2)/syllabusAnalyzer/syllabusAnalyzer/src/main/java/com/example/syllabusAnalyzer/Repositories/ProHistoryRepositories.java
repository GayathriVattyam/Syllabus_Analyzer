package com.example.syllabusAnalyzer.Repositories;

import com.example.syllabusAnalyzer.Users.ProHistoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProHistoryRepositories extends JpaRepository<ProHistoryDetails, Long> {
}
