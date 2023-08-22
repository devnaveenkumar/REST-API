package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sser;
	@PostMapping("post")
	public StudentModel add(@RequestBody StudentModel ss) { //To post a single element
		return sser.save(ss);
	}
	
	@PostMapping("postn")
	public List<StudentModel> addn(@RequestBody List<StudentModel> ss) { //To post a list of elements
		return (List<StudentModel>)sser.addn(ss);
	}
	
	@GetMapping("get")
	public List<StudentModel>get(){ //To show elements
		return sser.show();
	}
	@PutMapping("put")
	public StudentModel put(@RequestBody StudentModel ss) { //To update elements
		return sser.update(ss);
	}
	@DeleteMapping("delete")
	public String delete(@RequestBody StudentModel ss) { //To delete an element by passing the object.
		sser.delete(ss);
		return "Lesgoo!";
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) { //To delete an object with respect to id
		sser.deleteById(id);
		return "Yaaassss!!";
	}
	
}
