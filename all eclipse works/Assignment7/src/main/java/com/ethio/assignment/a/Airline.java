package com.ethio.assignment.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airline {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	
	@OneToMany(mappedBy = "airline")
	List<Flight> flights = new ArrayList<>();

	public Airline() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	public void removeFlight(Flight flight) {
		flights.remove(flight);
	}
	public List<Flight> getFlights(){
		return flights;
	}
	
	@Override
	public String toString() {
		return "Airline [name=" + name + ", flights=" + flights + "]";
	}
}
