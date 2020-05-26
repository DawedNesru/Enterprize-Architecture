package com.ethio.codes.c;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String phoneNr;
	@ManyToMany   
	@JoinTable(name = "student_course",     
         joinColumns = { @JoinColumn(name = "Student_id") },      
         inverseJoinColumns = { @JoinColumn(name = "Course_id") }   )  
	
	private List<Course> courses = new ArrayList<>();
	public Student() {
		super();
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
	public String getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	void addCourse(Course course) {
		courses.add(course);
	}
	
	void removeCourse(Course course) {
		courses.remove(course);
	}
		
}
