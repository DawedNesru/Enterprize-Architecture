package com.example.demo.service.response;


public class CityResponse {


private Integer id;

private CountryResponse country;

private String name;



public CityResponse() {
	super();
}
public CityResponse(Integer id, CountryResponse country, String name) {
	super();
	this.id = id;
	this.country = country;
	this.name = name;
}
public Integer getId() {
	return id;
}
public CountryResponse getCountry() {
	return country;
}	
}
