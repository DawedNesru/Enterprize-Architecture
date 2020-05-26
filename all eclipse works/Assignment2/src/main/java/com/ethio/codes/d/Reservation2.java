package com.ethio.codes.d;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation2 {
@Id
@GeneratedValue
private long id;
private Date date;

public Reservation2() {

}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}
