package com.documents;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
public class ChallengeDocument {
	
	
	 	@Field
	    private String challengeId;
	    
	 	@Field
	    private Binary file;
	 	
	 	
	 	
	 	
	 	

		public String getChallengeId() {
			return challengeId;
		}

		public void setChallengeId(String challengeId) {
			this.challengeId = challengeId;
		}

		public Binary getFile() {
			return file;
		}

		public void setFile(Binary file) {
			this.file = file;
		}
	 	
	 	
	 	
	 	
	 	
	 	

}
