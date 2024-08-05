package com.example.EADSISProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentCode;
    private String courseCode;
    private double score1;
    private double score2;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    public Grade(Student student) {
        this.student = student;
    }

    // Constructors, Getters, and Setters

    // Method to calculate final score
    public double getFinalScore() {
        return 0.3 * score1 + 0.7 * score2;
    }

    // Method to convert score to grade
    public String getGrade() {
        double finalScore = getFinalScore();
        if (finalScore >= 8.0) return "A";
        if (finalScore >= 6.0) return "B";
        if (finalScore >= 4.0) return "D";
        return "F";
    }
}
