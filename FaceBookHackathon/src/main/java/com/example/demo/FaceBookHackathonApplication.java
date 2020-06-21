package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.controllers","com.documents"})
public class FaceBookHackathonApplication {

	//Add controllers here
	//https://young-cove-81657.herokuapp.com/yesno 
//	https://young-cove-81657.herokuapp.com/sentiment
//	https://young-cove-81657.herokuapp.com/image

	
	
	
	
//	 $.ajax({
//		    url: "/upload",
//		    type: "POST",
//		    data:formData ,
//		   
//		    processData: false,
//		    contentType: false,
//		    cache: false,
//		    success: function () {
//		      // Handle upload success
//		      // ...
//		    },
//		    error: function () {
//		      // Handle upload error
//		      // ...
//		    }
//		  });
	
	public static void main(String[] args) {
		SpringApplication.run(FaceBookHackathonApplication.class, args);
	}

}
