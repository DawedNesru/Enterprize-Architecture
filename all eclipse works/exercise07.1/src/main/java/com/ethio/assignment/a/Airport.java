package com.ethio.assignment.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Airport {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String city;
	private String country;
	private String airportcode;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@OneToMany(mappedBy = "departureAirport")
	List<Flight> departureFlights = new ArrayList<>();
	
	@OneToMany(mappedBy = "arrivalAirport")
	List<Flight> arrivalFlights = new ArrayList<>();
	
	public Airport() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAirportcode() {
		return airportcode;
	}
	public void setAirportcode(String airportcode) {
		this.airportcode = airportcode;
	}
		
	public void addDepartureFlight(Flight flight) {
		departureFlights.add(flight);
	}
	
	public void removeDepartureFlight(Flight flight) {
		departureFlights.remove(flight);
	}
	public List<Flight> getDepartureFlights(){
		return departureFlights;
	}
	
	public void addArrivalFlight(Flight flight) {
		arrivalFlights.add(flight);
	}
	
	public void removeArrivaleFlight(Flight flight) {
		arrivalFlights.remove(flight);
	}
	public List<Flight> getArrivalFlights(){
		return arrivalFlights;
	}
	
	@Override
	public String toString() {
		return "Airport [name=" + name + ", city=" + city + ", country=" + country + ", airportcode=" + airportcode
				+ ", flights=" + departureFlights + "]";
	}
	
	
}
