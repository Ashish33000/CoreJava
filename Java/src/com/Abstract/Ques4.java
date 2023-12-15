package com.Abstract;

public class Ques4 extends Ques1 {
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Inside abstract method");
		
	}
	public void callNonAbstractMethod() {
       Ques4 obj=new Ques4();
       obj.concreatetMethod();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ques4 obj=new Ques4();
		 obj.callNonAbstractMethod();

	}

	

}
