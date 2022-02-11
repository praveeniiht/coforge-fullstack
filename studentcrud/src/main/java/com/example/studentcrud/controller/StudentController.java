package com.example.studentcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentcrud.model.Student;
import com.example.studentcrud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAll(){
		return new ResponseEntity(service.findAllStudents(),HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<String> createStudent(@RequestBody Student student)
	{
		
		return new ResponseEntity(service.insertStudent(student), HttpStatus.CREATED);
		
	}
	
	@PostMapping("/htno/{htno}")
	public ResponseEntity<Optional<Student>> getStudentByHtno(@PathVariable("htno") int htno){
		
		return new ResponseEntity(service.findById(htno), HttpStatus.OK);
	}
	
	
	@PostMapping("/name/{name}")
	public ResponseEntity<Optional<Student>> getStudentByName(@PathVariable("name") String name){
		
		return new ResponseEntity(service.findByName(name), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student)
	{
		
		return new ResponseEntity(service.updateStudetn(student), HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/htno/{htno}")
	public ResponseEntity<String> deleteStudent(@PathVariable("htno") int htno){
		return new ResponseEntity(service.deleteStudent(htno), HttpStatus.ACCEPTED);
	}
	

}
