package com.ethio.codes.a;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private long employeenumber;
	private String name;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept;
	
	
	public Employee() {
	
	}
	public long getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(long employeenumber) {
		this.employeenumber = employeenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
