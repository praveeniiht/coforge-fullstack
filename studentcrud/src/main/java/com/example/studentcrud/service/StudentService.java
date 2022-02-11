package com.example.studentcrud.service;

import java.util.List;
import java.util.Optional;

import com.example.studentcrud.model.Student;

public interface StudentService {
	public List<Student> findAllStudents();
	public String insertStudent(Student student);
	public Optional<Student> findById(int htno);
	public Optional<Student> findByName(String name);
	public String updateStudetn(Student student);
	public String deleteStudent(int htno);
}
