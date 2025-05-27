package com.example.syllabusAnalyzer.Repositories;

import com.example.syllabusAnalyzer.Users.TopicDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepositories extends JpaRepository<TopicDetails, Long> {
}
