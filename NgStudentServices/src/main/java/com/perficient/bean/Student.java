package com.perficient.bean;

public class Student {

	int id;
	String firstName;
	String lastName ;
	
	
	public Student() {
		super();
	}
	
	public Student(int i,String fname,String lname) {
		super();
		this.id = i;
		this.firstName = fname;
		this.lastName = lname;
	}
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
}
