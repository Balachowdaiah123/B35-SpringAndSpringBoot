package org.tnsif.beanlifecycle;

public class Book {
	
	//private data member
	private String name;
	private String author;
	
	
	//the default constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//the getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	//to string method
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
    //spring bean life-cycle method and we can change the method signature should be same
	
	public void init()
	{
		System.out.println("Inside Init() method");
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy() method");
	}
	
}
