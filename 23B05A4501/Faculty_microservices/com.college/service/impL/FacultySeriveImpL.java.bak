package com.college.service.impl;

import com.college.entity.FacultyEntity;
import com.college.repository.FacultyRepository;
import com.college.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository repository;

    @Override
    public FacultyEntity createFaculty(FacultyEntity faculty) {
        return repository.save(faculty);
    }

    @Override
    public List<FacultyEntity> getAllFaculties() {
        return repository.findAll();
    }

    @Override
    public FacultyEntity getFacultyById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Faculty not found with ID: " + id));
    }

    @Override
    public FacultyEntity updateFaculty(Long id, FacultyEntity faculty) {
        FacultyEntity existing = getFacultyById(id);
        existing.setName(faculty.getName());
        existing.setDept(faculty.getDept());
        existing.setDesignation(faculty.getDesignation());
        existing.setEmail(faculty.getEmail());
        existing.setPhoneNo(faculty.getPhoneNo());
        return repository.save(existing);
    }

    @Override
    public void deleteFaculty(Long id) {
        repository.deleteById(id);
    }
}
