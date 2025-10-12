package com.college.studentmicroservices.controller;

import com.college.studentmicroservices.entity.StudentEntity;
import com.college.studentmicroservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Updated for 23B05A4501:  Create new student
    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity student) {
        return ResponseEntity.ok(service.createStudent(student));
    }

    // Updated for 23B05A4501:  Get all students
    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return ResponseEntity.ok(service.getAllStudents());
    }

    // Updated for 23B05A4501:  Get student by ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getStudentById(id));
    }

    // Updated for 23B05A4501:  Update student
    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> updateStudent(@PathVariable Long id, @RequestBody StudentEntity student) {
        return ResponseEntity.ok(service.updateStudent(id, student));
    }

    // Updated for 23B05A4501:  Delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
