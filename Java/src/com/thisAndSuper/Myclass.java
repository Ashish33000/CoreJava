package com.thisAndSuper;

public class Myclass {
	private String name="Ashish";
	private int age=20;
	public Myclass(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Paramilitraized constructor called");
	}
	  public Myclass() {
	        
	        this("name",25);
	        System.out.println("Default constructor called");
	    }
	  
	  public void displayEDetails() {
		  System.out.println("Name: "+name);
		  System.out.println("Age : "+age);
	  }

}
