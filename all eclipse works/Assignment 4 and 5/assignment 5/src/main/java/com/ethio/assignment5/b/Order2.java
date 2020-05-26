package com.ethio.assignment5.b;

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
@Table(name = "order_info")
public class Order2 {
@Id
@GeneratedValue
private long id;
private String orderId;
private Date date;
@ManyToOne
@JoinColumn(name = "cust_id")
private Customer3 cust;
@OneToMany
@JoinColumn(name = "order_id")
private List<OrderLine2> orderlines = new ArrayList<>();
public Order2() {
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
public Customer3 getCust() {
	return cust;
}
public void setCust(Customer3 cust) {
	this.cust = cust;
}

public void addOrderLine(OrderLine2 ordline) {
	orderlines.add(ordline);
}
public void removeOrderLine(OrderLine2 orderline) {
	orderlines.remove(orderline);
}
public List<OrderLine2> getOrderlines() {
	return orderlines;
}
public void setOrderlines(List<OrderLine2> orderlines) {
	this.orderlines = orderlines;
}


}
