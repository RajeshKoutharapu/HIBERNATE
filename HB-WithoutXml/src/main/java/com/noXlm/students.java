package com.noXlm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class students {
	@Id
private Integer sid;
private String name;
private Integer marks;
private String city;
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
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public students() {
	super();
	// TODO Auto-generated constructor stub
}
public students(Integer sid, String name, Integer marks, String city) {
	super();
	this.sid = sid;
	this.name = name;
	this.marks = marks;
	this.city = city;
}
@Override
public String toString() {
	return "students [sid=" + sid + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
}
}
