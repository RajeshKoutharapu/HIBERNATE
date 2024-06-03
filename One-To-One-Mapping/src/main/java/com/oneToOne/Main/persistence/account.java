package com.oneToOne.Main.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class account {
	@Id
   private Integer id;
   private Long  acno;
  private String actype;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Long getAcno() {
	return acno;
}
public void setAcno(Long acno) {
	this.acno = acno;
}
public String getActype() {
	return actype;
}
public void setActype(String actype) {
	this.actype = actype;
}
public account() {
	super();
	// TODO Auto-generated constructor stub
}
public account(Integer id, Long acno, String actype) {
	super();
	this.id = id;
	this.acno = acno;
	this.actype = actype;
}
@Override
public String toString() {
	return "account [id=" + id + ", acno=" + acno + ", actype=" + actype + "]";
}
  
  
}
