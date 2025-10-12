package com.college.studentmicroservices.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regId;

    @NotBlank(message = "Roll Number is required")
    private String rollNo;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Department is required")
    private String dept;

    @NotBlank(message = "Section is required")
    private String section;

    @NotBlank(message = "Aadhar ID is required")
    private String aadharId;

    private String skills;

    @DecimalMin(value = "0.0", message = "CGPA cannot be less than 0")
    @DecimalMax(value = "10.0", message = "CGPA cannot be greater than 10")
    private Double cgpa;

    // Updated for 23B05A4501:  Getters and Setters
    public Long getRegId() { return regId; }
    public void setRegId(Long regId) { this.regId = regId; }

    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }

    public String getAadharId() { return aadharId; }
    public void setAadharId(String aadharId) { this.aadharId = aadharId; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public Double getCgpa() { return cgpa; }
    public void setCgpa(Double cgpa) { this.cgpa = cgpa; }
}
