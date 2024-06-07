package com.oneToMany.persistence;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
   
	@Id
	private Integer sid;
	private String name;
	private String city;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> course;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", course=" + course + "]";
	}
	public Student(Integer sid, String name, String city, List<Course> course) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
