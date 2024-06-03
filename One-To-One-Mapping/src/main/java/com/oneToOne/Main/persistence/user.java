package com.oneToOne.Main.persistence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class user {
@Id
	private Integer id;
	private String name;
	private Long salary;
	@OneToOne(cascade = CascadeType.ALL)
	private account acno;
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(Integer id, String name, Long salary,account acno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.acno = acno;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", salary=" + salary + ", acno=" + acno + "]";
	}
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
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public account getAcno() {
		return acno;
	}
	public void setAcno(account acno) {
		this.acno = acno;
	}
	
}
