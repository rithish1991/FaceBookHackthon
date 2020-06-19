package com.documents;

import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class HackathonDocument {
	
	
		
	    @Field
	    private String id;
	    
	    
	    @Field
	    private Binary videoFile;
	    
	    
	    
	    @Field
	    private List<ChallengeDocument> documents;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<ChallengeDocument> getDocuments() {
			return documents;
		}

		public void setDocuments(List<ChallengeDocument> documents) {
			this.documents = documents;
		}

		public Binary getVideoFile() {
			return videoFile;
		}

		public void setVideoFile(Binary videoFile) {
			this.videoFile = videoFile;
		}

		
		
		
		

}
