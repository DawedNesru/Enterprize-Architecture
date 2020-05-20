package com.ethio.examples;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Car {
@Id
@GeneratedValue
int id;
private String brand;
@Temporal(TemporalType.DATE)
private Date year;
private double price;


public Car() {
	
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public Date getYear() {
	return year;
}


public void setYear(Date year) {
	this.year = year;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


}
