package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookModel;
import com.example.demo.repository.BookRepo;
@Service
public class BookService {
	@Autowired
	BookRepo br;
	public BookModel add(BookModel b) {
		return br.save(b);
	}
	
	public List<BookModel> show(){
		return br.findAll();
	}
	
	public void remove(int id) {
		br.deleteById(id);
	}
	
	public Optional<BookModel> getbytid(int id) {
		return br.findById(id);
	}
	
	public String update(BookModel b) {
		br.saveAndFlush(b);
		return "Updated Successfully!";
	}
	
}
