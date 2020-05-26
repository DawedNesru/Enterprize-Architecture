package com.ethio.codes.d;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer2 {
@Id
@GeneratedValue
private long id;
private String name;

@OneToMany
private List<Reservation2> reservation = new ArrayList<>();

public Customer2() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Reservation2>  getReservation() {
	return reservation;
}
public void addReservation(Reservation2 resev) {
	reservation.add(resev);
}

public void removeReservation(Reservation2 res) {
	reservation.remove(res);
}

}
