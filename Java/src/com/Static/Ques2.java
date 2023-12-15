package com.Static;

public class Ques2 {
	 // Instance variables
    int instanceVar1 = 20;
   String instanceVar2 = "Kumar";
   static void printInstanceVariable() {
   	Ques2 obj=new Ques2();
   	System.out.println("instance method 1: "+obj.instanceVar1);
   	System.out.println("instance method 2: "+obj.instanceVar2);
   	
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInstanceVariable();

	}

}
