package org.tnsif.usingautowireannot;

public class Passport {
	
	//private data member
	private String city;
	private String enddate;
	
	
	
	//getters and setters
    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	/* default constructor
	public Passport() {
		super();
		System.out.println("Inside Default-passport constructor");
	}*/
	
	public void documentation()
	{
		System.out.println("Address and Identity proof");
	}
	

}
