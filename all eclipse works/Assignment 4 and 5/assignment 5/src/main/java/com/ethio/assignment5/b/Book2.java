package com.ethio.assignment5.b;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("book")
public class Book2  extends Product2{

private String title;
public Book2() {
	super();
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
