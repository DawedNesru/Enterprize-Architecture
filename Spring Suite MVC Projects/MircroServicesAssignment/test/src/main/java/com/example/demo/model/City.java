package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {

@Id
@Column(name = "")
private Integer id;
@Column(name = "CITY")
private String name;
@ManyToOne
@JoinColumn(name = "COUNTRY_ID")
private Country country;
public Integer getId() {
	return id;
}
public Country getCountry() {
	return country;
}
public String getName() {
	return name;
}	


}
