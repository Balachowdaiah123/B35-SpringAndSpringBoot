package org.tnsif.springioc;
//to demonstrate a program on spring IOC 
//implementable class for sim interface
public class Atrial implements Sim {
	
	
	

	public Atrial() {
		System.out.println("Atrial class constructor");
	}

	public void call() {
		System.out.println("I am using atrial calling");
		
	}

	public void data() {
		System.out.println("I am using atrial calling");
	}

}
