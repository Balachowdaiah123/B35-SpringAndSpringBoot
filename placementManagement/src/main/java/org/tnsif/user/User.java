package org.tnsif.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String type;
	private Integer password;
	
	//default constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public User(Integer id, String name, String type, Integer password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	
	

}
