package com.documents;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document
public class document {
	
	
	@Field
    private Binary video_file;

	public Binary getVideo_file() {
		return video_file;
	}

	public void setVideo_file(Binary video_file) {
		this.video_file = video_file;
	}
	
	
	
	

}
