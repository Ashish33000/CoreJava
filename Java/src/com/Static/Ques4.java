package com.Static;

public class Ques4 {
	 public void instanceMethod() {
	        System.out.println("Inside instanceMethod");
	    }

	  
	    public static void staticMethod() {
	        Ques4 obj = new Ques4(); 
	        obj.instanceMethod(); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         staticMethod();
	}

}
