package com.ethio.codes.c;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String coursenumber;
	private String name;   


	@ManyToMany(mappedBy = "courses")
	private List<Student> students = new ArrayList<>();

	public Course() {
		super();
	}

	
		public String getCoursenumber() {
		return coursenumber;
	}


	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student std) {
		students.add(std);
	}

	public void removeStudent(Student std) {
		students.remove(std);
	}
}