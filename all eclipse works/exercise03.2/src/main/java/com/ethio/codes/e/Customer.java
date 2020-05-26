package com.ethio.codes.e;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
@Id
@GeneratedValue
private long id;
private String name;

@ManyToOne
private Reservation reservation;

public Customer() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Reservation getReservation() {
	return reservation;
}
public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}

}
