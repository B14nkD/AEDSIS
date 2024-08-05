package com.example.EADSISProject.Controller;

import com.example.EADSISProject.Entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grades")
public class GradeController<GradeService> {
    @Autowired
    private GradeService gradeService;
    private Grade grade;

    @PostMapping
    public int addGrade() {
        return addGrade(null);
    }

    @PostMapping
    public int addGrade(@RequestBody Grade grade) {
        this.grade = grade;
        return gradeService.hashCode();
    }

    @GetMapping("/student/{studentCode}")
    public Class<?> getGradesByStudentCode(@PathVariable String studentCode) {
        return gradeService.getClass();
    }

    public void setGradeService(GradeService gradeService) {
        this.gradeService = gradeService;
    }
}
