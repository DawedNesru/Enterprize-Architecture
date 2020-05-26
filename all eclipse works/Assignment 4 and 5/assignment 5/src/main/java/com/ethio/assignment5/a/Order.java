package com.ethio.assignment5.a;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_cont")
public class Order {
@Id
@GeneratedValue
private long id;
private String orderId;
private Date date;
@ManyToOne
@JoinColumn(name = "cust_id")
private Customer cust;
@OneToMany
@JoinColumn(name = "order_id")
private List<OrderLine> orderlines = new ArrayList<>();
public Order() {
	super();
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Customer getCust() {
	return cust;
}
public void setCust(Customer cust) {
	this.cust = cust;
}

public void addOrderLine(OrderLine ordline) {
	orderlines.add(ordline);
}
public void removeOrderLine(OrderLine orderline) {
	orderlines.remove(orderline);
}
public List<OrderLine> getOrderlines() {
	return orderlines;
}
public void setOrderlines(List<OrderLine> orderlines) {
	this.orderlines = orderlines;
}


}
