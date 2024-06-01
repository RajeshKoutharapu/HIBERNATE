package com.autogenerate.persistence;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String role;
	private Integer salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employe [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	public employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employe( String name, String role, Integer salary) {
		super();
		
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
}
