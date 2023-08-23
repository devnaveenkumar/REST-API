package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ApplicationModel;

public interface ApplicationRepo extends JpaRepository<ApplicationModel, Integer>{
	
}
