package com.ethio.codes.a;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class Laptop5 {
		@Id
		@GeneratedValue
		private long id;
		private String brand;
		private String type;
		@ManyToOne
		@JoinColumn(name = "emp_id")
	    private Employee5 emp;

		public Laptop5() {

		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Employee5 getEmp() {
			return emp;
		}

		public void setEmp(Employee5 emp) {
			this.emp = emp;
		}

	

	}

