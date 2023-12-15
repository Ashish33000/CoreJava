package com.Basic;

public class Academy {
   private String name;
   private String address;
   private String course;
   private Double fees;
   private int students;
public Academy(String name, String address, String course, Double fees, int students) {
	super();
	this.name = name;
	this.address = address;
	this.course = course;
	this.fees = fees;
	this.students = students;
}


 public void getDetails(){
	System.out.println(name+" "+address +" "+course);
 }
 public void findNumberOfStudent() {
	System.out.println(students);
 }
 public void updateFees(double updatedfee) {
	System.out.println(updatedfee);
 }
 
}

