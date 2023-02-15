package org.tnsif.usingautowireannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Citizen {
	
	private Passport passport;
	
	public Citizen() {
		
		
		System.out.println("Inside Citizen-Default constructor");
		this.passport=passport;
	}
	//DI using setters
	//@Autowired annotation-->to get element in xml configuration file
	//@Autowired annotation can be used to auto wired on the setters method
	@Autowired
	@Qualifier("pass")
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	//DI using constructor
	//@Autowired on constructor
	/*@Autowired
	public Citizen(Passport passport) {
		System.out.println("Autowired constructor");
		this.passport = passport;
	}*/


	//default constructor
	
	 /*public Citizen() {
		
		
		System.out.println("Inside Citizen-Default constructor");
		this.passport=passport;
	}*/
	
	
	public void display()
	{
		passport.documentation();
		System.out.println("Result:  "+passport.getCity()+""+passport.getEnddate());
	}
	

}
