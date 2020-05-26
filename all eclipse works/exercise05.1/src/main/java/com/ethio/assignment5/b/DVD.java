package com.ethio.assignment5.b;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dvd")
public class DVD  extends Product2{

private String genre;
public DVD() {
	super();
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}


}
