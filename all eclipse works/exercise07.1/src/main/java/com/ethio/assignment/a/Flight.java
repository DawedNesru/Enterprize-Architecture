package com.ethio.assignment.a;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Flight {
	@Id
	@GeneratedValue
	private long id;
	private long flightnr;
	private LocalDate departureDate;
	private LocalTime departureTime;
	private LocalDate arrivalDate;
	private LocalTime  arrivalTime;
	
	@ManyToOne
	@JoinColumn(name = "departure_airport_id")
	private Airport departureAirport;
	
	@ManyToOne
	@JoinColumn(name = "arrival_airport_id")
	private Airport arrivalAirport;
	
	@ManyToOne
	@JoinColumn(name = "airplane_id")
	private Airplane airplane;
	
	
	@ManyToOne
	@JoinColumn(name = "airline_id")
	private Airline airline;
	
	public Flight() {
		super();
	}
	public long getFlightnr() {
		return flightnr;
	}
	public void setFlightnr(long flightnr) {
		this.flightnr = flightnr;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Airport getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}
	
	public Airport getArrivalAirport() {
		return departureAirport;
	}
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "Flight [flightnr=" + flightnr + ", departureDate=" + departureDate + ", departureTime=" + departureTime
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", arrival airport=" + arrivalAirport
				+ ", airplane=" + airplane + ", airline=" + airline + "]";
	}


}

