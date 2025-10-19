package com.college.studentmicroservices.service.impl;

import com.college.studentmicroservices.entity.StudentEntity;
import com.college.studentmicroservices.repository.StudentRepository;
import com.college.studentmicroservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public StudentEntity createStudent(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        StudentEntity existing = getStudentById(id);
        existing.setRollNo(student.getRollNo());
        existing.setName(student.getName());
        existing.setDept(student.getDept());
        existing.setSection(student.getSection());
        existing.setAadharId(student.getAadharId());
        existing.setSkills(student.getSkills());
        existing.setCgpa(student.getCgpa());
        return repository.save(existing);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
