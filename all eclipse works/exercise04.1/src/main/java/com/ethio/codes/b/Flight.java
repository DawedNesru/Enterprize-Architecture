package com.ethio.codes.b;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight {
@Id
@GeneratedValue
private long id;
private long flightnumber;
private String fromX;
private String toY;
private Date date;

public Flight() {
	super();
}

public long getFlightnumber() {
	return flightnumber;
}

public void setFlightnumber(long flightnumber) {
	this.flightnumber = flightnumber;
}

public String getFrom() {
	return fromX;
}

public void setFrom(String from) {
	this.fromX = from;
}

public String getTo() {
	return toY;
}

public void setTo(String to) {
	this.toY = to;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}




}
