package com.ethio.assignment5.b;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@DiscriminatorColumn(
		name = "product_type",
        discriminatorType = DiscriminatorType.STRING)
@Table(name = "product_info")
public class Product2 {
@Id
@GeneratedValue
private long id;
private String name;
private String description;
public Product2() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
