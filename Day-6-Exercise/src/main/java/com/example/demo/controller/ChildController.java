package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChildModel;
import com.example.demo.service.ChildServices;

@RestController
public class ChildController {
	@Autowired
	ChildServices cs;
	
	@GetMapping("get")
	public List<ChildModel> showall(){
		return cs.show();
	}
	
	@PostMapping("postn")
	public List<ChildModel> insert(@RequestBody List<ChildModel> ee){
		return (List<ChildModel>)cs.addn(ee);
	}
	
	@GetMapping("/{name}")
	public List<ChildModel> sort(@PathVariable String name){
		return cs.sortinfo(name);
	}
	
	@GetMapping("{pageno}/{pagesize}")
	public List<ChildModel> showinfo(@PathVariable int pageno,@PathVariable int pagesize){
		return cs.getbypage(pageno, pagesize);
	}
}
