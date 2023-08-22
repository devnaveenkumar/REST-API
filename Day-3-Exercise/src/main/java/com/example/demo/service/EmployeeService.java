package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository er;
	
	public EmployeeModel add(EmployeeModel ee) {
		return er.save(ee);
	}
	
	public List<EmployeeModel> show(){
		return er.findAll();
	}
}
