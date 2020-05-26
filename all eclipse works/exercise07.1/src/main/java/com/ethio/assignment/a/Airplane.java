package com.ethio.assignment.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airplane {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private long serialnr;
	private String model;
	private int capacity;
	
	@OneToMany(mappedBy = "airplane")
	List<Flight> flights = new ArrayList<>();
	public Airplane() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSerialnr() {
		return serialnr;
	}
	public void setSerialnr(long serialnr) {
		this.serialnr = serialnr;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
		return "Airplane [name=" + name + ", serialnr=" + serialnr + ", model=" + model + ", capacity=" + capacity
				+ ", flights=" + flights + "]";
	}
	 
}
