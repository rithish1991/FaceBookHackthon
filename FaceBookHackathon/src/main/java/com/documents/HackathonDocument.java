package com.documents;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class HackathonDocument {
	
	
		
	    @Field
	    private String id;
	    
	    @Field
	    private String challengeId;
	    

		@Field
	    private Binary file;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Binary getFile() {
			return file;
		}

		public void setFile(Binary file) {
			this.file = file;
		}

		public String getChallengeId() {
			return challengeId;
		}

		public void setChallengeId(String challengeId) {
			this.challengeId = challengeId;
		}
		
		
		
		

}
