package com.example.syllabusAnalyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.syllabusAnalyzer.Services.CourseServices;
import com.example.syllabusAnalyzer.Users.CourseDetails;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseServices service;

    @PostMapping("/save")
    public void saveCourse(@RequestBody CourseDetails course) {
        service.saveCourse(course);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CourseDetails> getCourse(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCourse(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteCourse(id);
    }

    @PutMapping("/update")
    public ResponseEntity<CourseDetails> updateCourse(@RequestBody CourseDetails course) {
        return ResponseEntity.ok(service.updateCourse(course));
    }
}
