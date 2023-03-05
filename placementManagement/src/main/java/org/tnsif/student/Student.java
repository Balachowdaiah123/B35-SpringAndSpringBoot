package org.tnsif.student;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	private Integer id;
	private String name;
	private Integer roll;
	private String qualification;
	private String course;
	private Integer year;
	private Integer hallticketno;
	
	   public Student() {
		   
		   
	    }
	 
	    
	    public Student(Integer id, String name, Integer roll, String qualification, String course, Integer year,
				Integer hallticketno) {
			super();
			this.id = id;
			this.name = name;
			this.roll = roll;
			this.qualification = qualification;
			this.course = course;
			this.year = year;
			this.hallticketno = hallticketno;
		}


		


		/*The @Idannotation is inherited from javax.persistence.Id， indicating the member field below
	     *  is the primary key of current entity. Hence your 
	     * Hibernate and spring framework as well as you can do some reflect works based on this annotation*/
	    @Id
	    /*The @GeneratedValue annotation is to configure the way of increment of the specified column(field).
	     *  For example when using Mysql, you may specify auto_increment in the definition
	     *   of table to make it self-incremental,*/
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    //getters and setters method
		
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


		public Integer getRoll() {
			return roll;
		}


		public void setRoll(Integer roll) {
			this.roll = roll;
		}


		public String getQualification() {
			return qualification;
		}


		public void setQualification(String qualification) {
			this.qualification = qualification;
		}


		public String getCourse() {
			return course;
		}


		public void setCourse(String course) {
			this.course = course;
		}


		public Integer getYear() {
			return year;
		}


		public void setYear(Integer year) {
			this.year = year;
		}


		public Integer getHallticketno() {
			return hallticketno;
		}


		public void setHallticketno(Integer hallticketno) {
			this.hallticketno = hallticketno;
		}


		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
					+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + "]";
		}
}
