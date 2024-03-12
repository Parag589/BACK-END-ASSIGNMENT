package com.example.demo.controller;

import com.example.demo.domain.Course;
import com.example.demo.domain.Role;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @PostMapping("/create")
    public String createCourse(@RequestBody Course course) {
        // Implementation for creating a course
        return "Course created successfully";
    }

    @PutMapping("/update")
    public String updateCourse(@RequestBody Course course) {
        // Implementation for updating a course
        return "Course updated successfully";
    }

    @GetMapping("/get")
    public Object getCourse(@RequestParam Role role) {
        // Implementation for retrieving a course based on the role
        // Return different output for student and course developer/content developer
        return "Course details based on role: " + role;
    }
}
