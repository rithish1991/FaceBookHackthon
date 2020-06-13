package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/HelloTest")
	public String greeting() {
		return "Hello from Heroku";
	}
	

}
