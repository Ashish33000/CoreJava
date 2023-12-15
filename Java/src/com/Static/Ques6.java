package com.Static;

public class Ques6 {
	// Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Ashish";

   // Instance variables
    int instanceVar1 = 20;
   String instanceVar2 = "Kumar";
   void instanceMethod() {
       System.out.println("inside instance method");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		System.out.println("Static variable 1"+staticVar1);
		System.out.println("Static variable 2"+staticVar2);
		 Ques6 obj=new Ques6();
		 System.out.println("instance variable 1"+obj.instanceVar1);
			System.out.println("instance variable 2"+obj.instanceVar2);
			obj.instanceMethod();
		

	}

}
