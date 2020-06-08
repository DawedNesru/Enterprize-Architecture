package com.example.demo.service.response;


public class CountryResponse {

private Integer country_id;

private String name;



public CountryResponse() {
	super();

}

public CountryResponse(Integer country_id, String name) {
	super();
	this.country_id = country_id;
	this.name = name;
}

public Integer getCountry_id() {
	return country_id;
}

public String getName() {
	return name;
}


}
