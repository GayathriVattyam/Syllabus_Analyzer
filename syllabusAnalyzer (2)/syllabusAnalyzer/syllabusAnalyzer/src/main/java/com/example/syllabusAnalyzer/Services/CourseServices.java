package com.example.syllabusAnalyzer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syllabusAnalyzer.Repositories.CourseRepositories;
import com.example.syllabusAnalyzer.Users.CourseDetails;
import com.example.syllabusAnalyzer.exceptions.ResourceNotFoundException;

@Service
public class CourseServices {

    @Autowired
    private CourseRepositories repo;

    public void saveCourse(CourseDetails course) {
        repo.save(course);
    }

    public CourseDetails getCourse(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Course not found with ID: " + id));
    }

    public void deleteCourse(Long id) {
        repo.delete(getCourse(id));
    }

    public CourseDetails updateCourse(CourseDetails course) {
        CourseDetails existing = getCourse(course.getC_id());

        existing.setName(course.getName());
        existing.setDescription(course.getDescription());
        existing.setCreatedAt(course.getCreatedAt());

        return repo.save(existing);
    }
}
