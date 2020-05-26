package com.ethio.codes.e;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
@Id
@GeneratedValue
private long id;
private Date date;
@ManyToOne
private Book book;


public Reservation() {

}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}

}
