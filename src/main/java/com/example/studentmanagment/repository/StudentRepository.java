package com.example.studentmanagment.repository;

import com.example.studentmanagment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
