package com.ethio.codes.f;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee2 {
	@Id
	private long employeenumber;
	private String name;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department2 dept;
	@OneToMany(mappedBy = "emp")
	private List<Office> offices = new ArrayList<>();
	public Employee2() {
	
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
	public Department2 getDept() {
		return dept;
	}
	public void setDept(Department2 dept) {
		this.dept = dept;
	}
	
	public void addOffice(Office off) {
		offices.add(off);
	}
	
	public void removeOffice(Office off) {
		offices.remove(off);
	}
	
}
