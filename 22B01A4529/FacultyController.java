package com.college.controller;

import com.college.entity.FacultyEntity;
import com.college.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {

    @Autowired
    private FacultyService service;

    // Create new faculty
    @PostMapping
    public ResponseEntity<FacultyEntity> createFaculty(@RequestBody FacultyEntity faculty) {
        return ResponseEntity.ok(service.createFaculty(faculty));
    }

    // Get all faculties
    @GetMapping
    public ResponseEntity<List<FacultyEntity>> getAllFaculties() {
        return ResponseEntity.ok(service.getAllFaculties());
    }

    // Get faculty by ID
    @GetMapping("/{id}")
    public ResponseEntity<FacultyEntity> getFacultyById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getFacultyById(id));
    }

    // Update faculty
    @PutMapping("/{id}")
    public ResponseEntity<FacultyEntity> updateFaculty(@PathVariable Long id, @RequestBody FacultyEntity faculty) {
        return ResponseEntity.ok(service.updateFaculty(id, faculty));
    }

    // Delete faculty
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
        service.deleteFaculty(id);
        return ResponseEntity.noContent().build();
    }
}
