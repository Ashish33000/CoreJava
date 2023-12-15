package com.Static;

public class Ques7 {
	// Static method
    public static void staticMethod() {
        System.out.println("Inside staticMethod");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Inside instanceMethod");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		 Ques7 obj=new Ques7();
		 obj.instanceMethod();

	}

}
