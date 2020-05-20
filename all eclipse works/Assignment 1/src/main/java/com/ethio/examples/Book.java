package com.ethio.examples;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Book {
	@Id
	@GeneratedValue
private int id;
private String title;
private String ISBN;
private String author;
private double price;
@Temporal(TemporalType.DATE)
private java.util.Date publish_date;


public Book() {

}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public java.util.Date getPublish_date() {
	return publish_date;
}
public void setPublish_date(java.util.Date publish_date) {
	this.publish_date = publish_date;
}


}