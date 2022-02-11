package com.example.studentcrud.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentcrud.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

@Query("select s from Student s where s.name=?1")
 public Optional<Student> findByName(String name);
}
