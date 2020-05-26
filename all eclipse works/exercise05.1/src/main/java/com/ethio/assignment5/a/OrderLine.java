package com.ethio.assignment5.a;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {
@Id
@GeneratedValue
private long id;
private long quantity;
private double price;
@ManyToOne
@JoinColumn(name = "product_id")
private Product product;
public OrderLine() {
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
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}



}
