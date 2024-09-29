package com.adnan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/api/v1/microthird")
	public String microThree() {
		System.out.println("hi I am Mirco Service 3 !!!!!!!!!");
		return "Hello I am microservice 3";
	}

}
