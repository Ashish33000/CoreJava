package com.Static;

public class Ques5 {
	  

	  
	     static void staticMethod() {
	    	 System.out.println("Inside staticMethod");
	    }
	     void instanceMethod() {
	    	
	    	 staticMethod();
		       
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ques5 obj=new Ques5();
		 obj.instanceMethod();

	}

}
