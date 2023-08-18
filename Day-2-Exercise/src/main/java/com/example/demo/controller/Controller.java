package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("John Green")
	private String name;
	@GetMapping("name")
	public String getName() {
		return "The name is " + name;
	}
}
