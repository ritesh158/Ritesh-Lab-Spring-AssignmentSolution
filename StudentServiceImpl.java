package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Repository


public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Transactional
	public Student findById(int id) {

		Student student = new Student();

		// find record with Id from the database table
		student = studentRepository.findById(id).get();

		return student;
	}

	@Transactional
	public void save(Student theStudent) {

		studentRepository.save(theStudent);

	}

	@Transactional
	public void deleteById(int id) {

		studentRepository.deleteById(id);

	}
	
	
}
