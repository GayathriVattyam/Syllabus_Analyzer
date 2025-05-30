package com.example.syllabusAnalyzer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syllabusAnalyzer.Users.UserDetails;

@Repository
public interface UserRepositories extends JpaRepository<UserDetails, Long> {
}
