package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	public StudentModel save(StudentModel ss) {
		return sr.save(ss);
	}
	public List<StudentModel> addn(List<StudentModel> ss) {
		return (List<StudentModel>)sr.saveAll(ss);
	}
	public List<StudentModel> show(){
		return sr.findAll();
	}
	public StudentModel update(StudentModel ss) {
		return sr.saveAndFlush(ss);
	}
	public void delete(StudentModel ss) {
		sr.delete(ss);
	}
	public void deleteById(int id) {
		sr.deleteById(id);
	}
}
