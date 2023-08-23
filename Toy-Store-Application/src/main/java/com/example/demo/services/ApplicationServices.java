package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.ApplicationModel;
import com.example.demo.repository.ApplicationRepo;

@Service
public class ApplicationServices {
	@Autowired
	ApplicationRepo ar;
	
	//To post a single object
	public ApplicationModel add(ApplicationModel aa) {
		return ar.save(aa);
	}
	
	//To post multiple objects
	public List<ApplicationModel> addn(List<ApplicationModel> aa){
		return (List<ApplicationModel>)ar.saveAll(aa);
	}
	
	//To get all objects
	public List<ApplicationModel> show(){
		return ar.findAll();
	}
	
	//To get object by id
	public Optional<ApplicationModel> getbyid(int id) {
		return ar.findById(id);
	}
	
	//To update an object
	public ApplicationModel update(ApplicationModel aa) {
		return ar.saveAndFlush(aa);
	}
	
	//To delete a single object
	public void delete(ApplicationModel aa) {
		ar.delete(aa);
	}
	
	//To delete an object with respect to id
	public void deletebyid(int id) {
		ar.deleteById(id);
	}
	
	public void deleteall() {
		ar.deleteAll();
	}
}
