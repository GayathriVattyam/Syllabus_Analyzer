package com.example.syllabusAnalyzer.Repositories;

import com.example.syllabusAnalyzer.Users.MaterialDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialsRepositories extends JpaRepository<MaterialDetails, Long> {
}
