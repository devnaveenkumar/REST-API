package com.example.demo.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApplicationModel;
import com.example.demo.services.ApplicationServices;

@RestController
public class ApplicationController {
	@Autowired
	ApplicationServices as;
	
	
	//To post single object
	@PostMapping("post")
	public ApplicationModel add(@RequestBody ApplicationModel aa) {
		return as.add(aa);
	}
	
	//To post multiple objects at a time
	@PostMapping("postn")
	public List<ApplicationModel> addn(@RequestBody List<ApplicationModel> aa){
		return (List<ApplicationModel>)as.addn(aa);
	}
	
	//To get all the objects
	@GetMapping("get")
	public List<ApplicationModel> show(){
		return as.show();
	}
	
	//To get a specific object by id
	@GetMapping("getbyid/{id}")
	public java.util.Optional<ApplicationModel> getbyid(@PathVariable int id) {
		return as.getbyid(id);
	}
	
	//To update an object
	@PutMapping("put")
	public ApplicationModel update(@RequestBody ApplicationModel aa) {
		return as.update(aa);
	}
	
	//To update an object with respect to id
	@PutMapping("putbyid/{id}")
	public String updatebyid(@RequestBody ApplicationModel aa, @PathVariable int id) {
		java.util.Optional<ApplicationModel> temp = as.getbyid(id);
		if(temp.isPresent()) {
			as.update(aa);
			return "Object updated successfully!";
		}
		return "Enter a valid id!";
		
	}
	
	//To delete an object
	@DeleteMapping("delete")
	public String delete(@RequestBody ApplicationModel aa) {
		as.delete(aa);
		return "Object is successfully deleted";
	}
	
	//To delete an object with respect to id
	@DeleteMapping("delete/{id}")
	public String deletebyid(@PathVariable int id) {
		as.deletebyid(id);
		return "Object deleted";
	}
	
	@DeleteMapping("removeall")
	public String deleteall() {
		as.deleteall();
		return "Everything is deleted";
	}
}
