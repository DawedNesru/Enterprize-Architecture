package com.ethio.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
@Id
@Column(name = "COUNTRY_ID")
private Integer country_id;

@Column(name = "COUNTRY")
private String name;

public Integer getCountry_id() {
	return country_id;
}

public String getName() {
	return name;
}


}
