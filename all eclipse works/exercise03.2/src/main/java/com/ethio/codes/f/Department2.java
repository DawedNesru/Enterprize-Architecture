package com.ethio.codes.f;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department2 {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@OneToMany(mappedBy = "dept")
	private List<Employee2> emps = new ArrayList<>();

	public Department2() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmployee(Employee2 emp) {
		emps.add(emp);
	}
	public void removeEmployee(Employee2 emp) {
		emps.remove(emp);
	}

}
