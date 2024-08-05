package com.example.EADSISProject.Service;

import com.example.EADSISProject.Entity.Grade;
import com.example.EADSISProject.Repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public <Grade> List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public Grade addGrade(Grade grade) {
        return (Grade) gradeRepository.save(grade);
    }

    public List<Grade> getGradesByStudentCode(String studentCode) {
        return gradeRepository.findByStudentCode(studentCode);
    }

    public class GradeService {
    }
}
