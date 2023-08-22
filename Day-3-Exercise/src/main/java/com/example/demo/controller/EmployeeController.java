package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService eer;
	
	@PostMapping("post")
	public EmployeeModel add(@RequestBody EmployeeModel ee) {
		return eer.add(ee);
	}
	@GetMapping("get")
	public List<EmployeeModel> show(){
		return eer.show();
	}
}
