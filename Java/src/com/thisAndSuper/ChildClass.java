package com.thisAndSuper;

public class ChildClass extends ParentClass{
	private String Childname;
	private int Childage;
	public ChildClass(String parentName, int parentAge, String childname, int childage) {
		super(parentName, parentAge);
		Childname = childname;
		Childage = childage;
		System.out.println("Constructor from Child class");
	}
	
	
	

}
