package com.ethio.codes.b;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Book2 {
@Id
@GeneratedValue
private	long id;
private	String isbn;
private String title;
private	String author;
@ManyToOne
@JoinTable(name = "book_publisher")
private Publisher publisher;

public Publisher getPublisher() {
	return publisher;
}

public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}

public Book2() {

}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}



}
