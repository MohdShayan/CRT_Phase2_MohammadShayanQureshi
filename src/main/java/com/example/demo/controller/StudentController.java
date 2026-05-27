package com.example.demo.controller;


import com.example.demo.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping
    public ResponseEntity<String> createStudent(@Valid @RequestBody StudentDTO student) {
        return ResponseEntity.status(201).body("Student created successfully");
    }
}
