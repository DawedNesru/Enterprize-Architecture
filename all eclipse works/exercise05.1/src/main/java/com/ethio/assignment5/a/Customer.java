package com.ethio.assignment5.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info2")
public class Customer {
@Id
@GeneratedValue
private long id;
private String firstName;
private String lastName;
@OneToMany(mappedBy = "cust")
private List<Order> orders = new ArrayList<>();
public Customer() {
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
public List<Order> getOrders() {
	return orders;
}
public void setOrder(List<Order> orders) {
	this.orders = orders;
}

public void addOrder(Order ord) {
	orders.add(ord);
}
 
public void removeOrder(Order ord) {
	orders.remove(ord);
}

}
