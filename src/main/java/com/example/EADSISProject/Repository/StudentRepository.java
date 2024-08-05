package com.example.EADSISProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository<Student> extends JpaRepository<Student, Long> {
}
