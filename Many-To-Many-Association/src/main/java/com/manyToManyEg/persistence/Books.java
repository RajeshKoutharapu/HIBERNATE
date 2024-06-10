package com.manyToManyEg.persistence;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(Integer id, String bookname, List<Authors> authorslist) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorslist = authorslist;
	}
	@Id
  private Integer id;
	private String bookname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Authors> authorslist;
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookname=" + bookname + ", authorslist=" + authorslist + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public List<Authors> getAuthorslist() {
		return authorslist;
	}
	public void setAuthorslist(List<Authors> authorslist) {
		this.authorslist = authorslist;
	}
}
