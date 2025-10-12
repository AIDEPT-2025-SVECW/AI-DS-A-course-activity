package com.college.service;

import com.college.entity.FacultyEntity;
import java.util.List;

public interface FacultyService {

    FacultyEntity createFaculty(FacultyEntity faculty);

    List<FacultyEntity> getAllFaculties();

    FacultyEntity getFacultyById(Long id);

    FacultyEntity updateFaculty(Long id, FacultyEntity faculty);

    void deleteFaculty(Long id);
}
