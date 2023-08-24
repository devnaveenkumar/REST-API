package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.ChildModel;
import com.example.demo.repository.ChildRepo;

@Service
public class ChildServices {
	@Autowired
	ChildRepo cr;
	public List<ChildModel> show(){
		return cr.findAll();
	}
	public List<ChildModel> addn(List<ChildModel> ee){
		return (List<ChildModel>)cr.saveAll(ee);
	}
	public List<ChildModel> sortinfo(String s){
		return cr.findAll(org.springframework.data.domain.Sort.by(org.springframework.data.domain.Sort.Direction.ASC, s));
	}
	public List<ChildModel> getbypage (int pgno, int pgsize) {
		Page<ChildModel> p = cr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
}
