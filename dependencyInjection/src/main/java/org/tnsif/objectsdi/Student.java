package org.tnsif.objectsdi;
//program to demonstrate DI in terms of objects
public class Student {
	
	
	//DI in the terms of objects
	Address address;

	
	//DI using setters
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void print()
	{
		address.display();
	}
	
	
	
	
	
	

}
