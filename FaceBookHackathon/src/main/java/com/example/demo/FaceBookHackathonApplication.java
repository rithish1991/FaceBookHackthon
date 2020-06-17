package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.controllers","com.documents"})
public class FaceBookHackathonApplication {

	//Add controllers here
	//
	
	public static void main(String[] args) {
		SpringApplication.run(FaceBookHackathonApplication.class, args);
	}

}
