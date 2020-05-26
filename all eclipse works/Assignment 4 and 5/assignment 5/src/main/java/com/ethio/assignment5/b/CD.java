package com.ethio.assignment5.b;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cd")

public class CD extends Product2 {

	private String artist;
	
	
	public CD() {
		super();
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
}
