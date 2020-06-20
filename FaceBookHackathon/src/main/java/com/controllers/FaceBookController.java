package com.controllers;

import java.util.ArrayList;
import java.util.List;

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

import com.documents.ChallengeDocument;
import com.documents.HackathonDocument;

//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.mongodb.client.MongoDatabase;



@RestController
public class FaceBookController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@PostMapping("/upload")
	public String singleFileUpload(@RequestParam("file1") MultipartFile fileOne,@RequestParam("file2") MultipartFile fileTwo,@RequestParam("file3") MultipartFile fileThree,@RequestParam("file4") MultipartFile fileFour,@RequestParam("file5") MultipartFile fileFive,
			@RequestParam("file6") MultipartFile fileSix, @RequestParam("file7") MultipartFile fileSeven
			) 
	{
		
		long count = 0;
	    try {
	    	  count = mongoTemplate.getCollection("hackathonDocument").countDocuments();
	    	 count++;
	    	HackathonDocument demoDocument = new HackathonDocument();
	        demoDocument.setId(Long.toString(count));
//	        demoDocument.setChallengeId(challenge);
//	        demoDocument.setFile(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));
	        demoDocument.setVideoFile(null);
	        ChallengeDocument challengeOne = new ChallengeDocument();
	        challengeOne.setChallengeId("1");
	        challengeOne.setFile(new Binary(BsonBinarySubType.BINARY, fileOne.getBytes()));
	        
	       
	        
	        ChallengeDocument challengeTwo = new ChallengeDocument();
	        challengeTwo.setChallengeId("2");
	        challengeTwo.setFile(new Binary(BsonBinarySubType.BINARY, fileTwo.getBytes()));
	        
	        
	        
	        ChallengeDocument challengeThree = new ChallengeDocument();
	        challengeThree.setChallengeId("3");
	        challengeThree.setFile(new Binary(BsonBinarySubType.BINARY, fileThree.getBytes()));
	        
	        
	        ChallengeDocument challengeFour = new ChallengeDocument();
	        challengeFour.setChallengeId("4");
	        challengeFour.setFile(new Binary(BsonBinarySubType.BINARY, fileFour.getBytes()));
	        
	         
	        
	        ChallengeDocument challengeFive = new ChallengeDocument();
	        challengeFive.setChallengeId("5");
	        challengeFive.setFile(new Binary(BsonBinarySubType.BINARY, fileFive.getBytes()));
	        
	        
	        ChallengeDocument challengeSix = new ChallengeDocument();
	        challengeSix.setChallengeId("6");
	        challengeSix.setFile(new Binary(BsonBinarySubType.BINARY, fileSix.getBytes()));
	        
	        
	        ChallengeDocument challengeSeven = new ChallengeDocument();
	        challengeSeven.setChallengeId("7");
	        challengeSeven.setFile(new Binary(BsonBinarySubType.BINARY, fileSeven.getBytes()));
	        
	        
	        List<ChallengeDocument> listOfDocuments = new ArrayList<ChallengeDocument>();
	        listOfDocuments.add(challengeOne);
	        listOfDocuments.add(challengeTwo);
	        listOfDocuments.add(challengeThree);
	        listOfDocuments.add(challengeFour);
	        listOfDocuments.add(challengeFive);
	        listOfDocuments.add(challengeSix);
	        listOfDocuments.add(challengeSeven);
	        demoDocument.setDocuments(listOfDocuments);
	        mongoTemplate.insert(demoDocument);
	      
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "failure";
	    }
	    return Long.toString(count);
	}

}
