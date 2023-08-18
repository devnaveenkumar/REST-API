package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome Spring boot";
	}
	@GetMapping("name")
	public String getName() {
		return " Welcome Mr.Green !";
	}
	@GetMapping("color")
	public String getColor() {
		return " My favorite color is Red";
	}
}
