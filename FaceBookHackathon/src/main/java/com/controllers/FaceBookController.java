package com.controllers;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.documents.HackathonDocument;

//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.mongodb.client.MongoDatabase;



@RestController
public class FaceBookController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@PostMapping("/upload")
	public String singleFileUpload(@RequestParam("file") MultipartFile multipart) {
	    try {
	    	HackathonDocument demoDocument = new HackathonDocument();
	        demoDocument.setId("1993");
	        demoDocument.setFile(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));
	        mongoTemplate.insert(demoDocument);
	        System.out.println(demoDocument);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "failure";
	    }
	    return "success";
	}

}
