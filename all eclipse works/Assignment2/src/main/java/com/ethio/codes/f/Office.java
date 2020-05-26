package com.ethio.codes.f;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Office {
	@Id
	@GeneratedValue
private long id;
private int roomNum;
private String building;
@ManyToOne
@JoinColumn(name = "emp_id")
private Employee2 emp;


public Office() {
	
}
public int getRoomNum() {
	return roomNum;
}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}
public String getBuilding() {
	return building;
}
public void setBuilding(String building) {
	this.building = building;
}
public Employee2 getEmp() {
	return emp;
}
public void setEmp(Employee2 emp) {
	this.emp = emp;
}



}
