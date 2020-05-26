package com.ethio.assignment5.b;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer3 {
@Id
@GeneratedValue
private long id;
private String firstName;
private String lastName;
@OneToMany(mappedBy = "cust")
private List<Order2> orders = new ArrayList<>();
public Customer3() {
	super();
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public List<Order2> getOrders() {
	return orders;
}
public void setOrder(List<Order2> orders) {
	this.orders = orders;
}

public void addOrder(Order2 ord) {
	orders.add(ord);
}
 
public void removeOrder(Order2 ord) {
	orders.remove(ord);
}

}
