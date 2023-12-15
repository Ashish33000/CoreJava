package com.thisAndSuper;

public class Child extends Dad {
	public int age=4;
	public String name="suresh";
	public void ChildDetails() {
		super.ParentDetails();
		System.out.println("Child age: "+this.age);
		System.out.println("ChildName: "+this.name);
	}

}
