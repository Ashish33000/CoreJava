package com.constructor;

class Parent{
	int value1;
	int value2;
	Parent(){
		System.out.println("Defqault constructor in Parent class");
		value1=0;
		value2=0;
		
	}

	// constructor with two argument
		Parent(int v1,int v2){
			System.out.println("two argument constructor in Parent class");
			value1=v1;
			value2=v2;
			
		
	
}
}
class child extends Parent{
	int value3;
	child(){
		super();
		System.out.println("Default constructor in child class");
		value3=0;
	}
	child(int v3){
		super();
		System.out.println("one Arg constructor in child class");
		value3=v3;
	}
}

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj1=new child();
		child obj2=new child(7);

	}

}
