package com.manyToManyEg.persistence;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Authors {

	@Id
	private Integer aid;
	private String Aname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Books> bookslist;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public List<Books> getBookslist() {
		return bookslist;
	}
	public void setBookslist(List<Books> bookslist) {
		this.bookslist = bookslist;
	}
	@Override
	public String toString() {
		return "Authors [aid=" + aid + ", Aname=" + Aname + ", bookslist=" + bookslist + "]";
	}
	public Authors(Integer aid, String aname, List<Books> bookslist) {
		super();
		this.aid = aid;
		Aname = aname;
		this.bookslist = bookslist;
	}
	public Authors() {
		super();
		// TODO Auto-generated constructor stub
	}
}
