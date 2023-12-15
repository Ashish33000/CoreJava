package com.methodOverloading;
class Student{
	
	void study(String s1) {
		System.out.println("Student study subject: "+s1);
	}
	void study(String s1,String s2) {
		System.out.println("Student study subject: "+s1+" "+s2);
	}
	
}
	
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.study("Java");
		obj.study("React", "Node");

	}

}
