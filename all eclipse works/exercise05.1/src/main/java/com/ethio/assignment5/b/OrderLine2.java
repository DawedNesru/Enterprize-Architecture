package com.ethio.assignment5.b;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderline_info")
public class OrderLine2 {
@Id
@GeneratedValue
private long id;
private long quantity;
private double price;
@ManyToOne
@JoinColumn(name = "product_id")
private Product2 product;
public OrderLine2() {
	super();
}
public long getQuantity() {
	return quantity;
}
public void setQuantity(long quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product2 getProduct() {
	return product;
}
public void setProduct(Product2 product) {
	this.product = product;
}



}
