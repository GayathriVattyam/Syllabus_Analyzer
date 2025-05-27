package com.example.syllabusAnalyzer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syllabusAnalyzer.Users.NotificationDetails;

@Repository
public interface NotificationRepositories extends JpaRepository<NotificationDetails, Long> {
}
