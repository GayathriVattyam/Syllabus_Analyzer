package com.example.syllabusAnalyzer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.syllabusAnalyzer.Users.CourseDetails;

public interface CourseRepositories extends JpaRepository<CourseDetails, Long> {
}
