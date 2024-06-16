package com.update.delete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class entityClass {
	@Id
	private Integer sid;
	private String name;
	private String city;
	private Integer marks;
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "entityClass [sid=" + sid + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	public entityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public entityClass(Integer sid, String name, String city, Integer marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	

}
