package com.oneToMany.persistence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	@Id
   private Integer cid;
	private String cname;
	private Integer price;
	@ManyToOne(cascade = CascadeType.ALL)
	private Student st;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + ", st=" + st + "]";
	}
	public Course(Integer cid, String cname, Integer price, Student st) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
		this.st = st;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
