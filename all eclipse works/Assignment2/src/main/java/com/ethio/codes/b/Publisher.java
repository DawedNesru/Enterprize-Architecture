package com.ethio.codes.b;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Publisher {
@Id
@GeneratedValue
private long id;
private String name;


public Publisher() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
