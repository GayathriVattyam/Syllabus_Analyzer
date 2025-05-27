package com.example.syllabusAnalyzer.Repositories;

import com.example.syllabusAnalyzer.Users.UserProgressDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProgressRepositories extends JpaRepository<UserProgressDetails, Long> {
}
