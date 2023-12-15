package com.Static;

public class Ques3 {
	 static int staticVar1 = 10;
     static String staticVar2 = "Ashish";
     
     void printInstanceMethod() {
    	 System.out.println("value"+staticVar1);
    	 System.out.println("value"+staticVar2);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3 obj=new Ques3();
		obj.printInstanceMethod();
		

	}

}
