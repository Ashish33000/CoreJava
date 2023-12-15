package com.methodOverloading;
class Student1{
	void study(String subject) {
		System.out.println("Student study subject: "+subject);
	}
	void study(String subject,int marks) {
		System.out.println("Student study subject+Marks: "+subject+" "+marks);
	}
}
	
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj=new Student1();
		obj.study("Java");
		obj.study("React", 200);

	}

}
