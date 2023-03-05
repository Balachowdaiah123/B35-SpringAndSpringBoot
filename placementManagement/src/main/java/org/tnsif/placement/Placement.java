package org.tnsif.placement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Placement {
	
	@Id
	private Integer id;
	private String name;
	private Integer date;
	private String qualification;
	private String year;
	
	//default constructor
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	//peramerize constructor
	public Placement(Integer id, String name, Integer date, String qualification, String year) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}
	//getters and setters
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
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	//Tostring method
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}
	
	
	
	

}
