package com.example.EADSISProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository<Grade> extends JpaRepository<Grade, Long> {
    List<com.example.EADSISProject.Entity.Grade> findByStudentCode(String studentCode);
}
