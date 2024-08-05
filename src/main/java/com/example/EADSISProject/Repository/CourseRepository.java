package com.example.EADSISProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository<Course> extends JpaRepository<Course, Long> {
}
