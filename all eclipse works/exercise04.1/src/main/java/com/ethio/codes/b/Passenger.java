package com.ethio.codes.b;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passenger {
@Id
@GeneratedValue
private	long id;
private String name;
@OneToMany
private List<Flight> flights = new ArrayList<>();


public Passenger() {

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public List<Flight> getFlights() {
	return flights;
}

public void setFlights(List<Flight> flights) {
	this.flights = flights;
}

public void addFlight(Flight flight) {
	flights.add(flight);
}

public void removeFlight(Flight flight) {
	flights.remove(flight);
}


}
