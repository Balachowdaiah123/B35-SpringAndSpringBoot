package org.tnsif.certificate;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Certificate {
	
	@Id
	private Integer id;
	private Integer year;
	private String college;
	
	//default constructor
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterzied constructor
	public Certificate(Integer id, Integer year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}
	//getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
	//to string method
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}
	
	
	
	

}
