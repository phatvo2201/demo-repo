package com.luv2code.springdemo.entity;

public class Student {
	
	//private int id;
	private String firstName;
	private String lastName;
	//private boolean active;
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
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student() {
		
	}

}
