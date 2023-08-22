package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bs;
	
	@PostMapping("post")
	public BookModel add(@RequestBody BookModel b) {
		return bs.add(b);
	}
	
	@GetMapping("get")
	public List<BookModel> show(){
		return bs.show();
	}
	
	@GetMapping("/{id}")
	public Optional<BookModel> showbyid(@PathVariable int id) {
		return bs.getbytid(id);
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable int id, @RequestBody BookModel b) {
		Optional<BookModel> temp = bs.getbytid(id);
		if(temp.isPresent()) {
			return bs.update(b);
			
		}
		return "Enter a valid id.";
	}
}
