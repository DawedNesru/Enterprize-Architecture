package com.ethio.codes.a;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee5 {
	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	
	@OneToMany(mappedBy = "emp")
	private Set<Laptop5> laptops = new HashSet<>();
	
	public Employee5() {
	
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Set<Laptop5> getLaptop() {
		return laptops;
	}


	public void setLaptop(Set<Laptop5> laptop) {
		this.laptops = laptop;
	}


public void addLaptop(Laptop5 laptop) {
	laptops.add(laptop);
}

public void removeLaptop(Laptop5 laptop) {
	laptops.remove(laptop);
}

	
}
