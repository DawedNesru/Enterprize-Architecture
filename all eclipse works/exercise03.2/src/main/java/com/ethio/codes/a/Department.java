package com.ethio.codes.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@OneToMany(mappedBy = "dept")
	private List<Employee> emps = new ArrayList<>();

	public Department() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmployee(Employee emp) {
		emps.add(emp);
	}
	public void removeEmployee(Employee emp) {
		emps.remove(emp);
	}

}
