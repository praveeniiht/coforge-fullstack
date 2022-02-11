package com.example.studentcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Student;
import com.example.studentcrud.repo.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertStudent(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
		return "Inserted successfully";
	}

	@Override
	public Optional<Student> findById(int htno) {
		// TODO Auto-generated method stub
		
		return repo.findById(htno);
		
	}

	@Override
	public Optional<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public String updateStudetn(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
		return "Student updated successfully";
	}

	@Override
	public String deleteStudent(int htno) {
		// TODO Auto-generated method stub
		repo.deleteById(htno);
		return "student deleted";
	}

}
