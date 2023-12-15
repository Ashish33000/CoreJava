package com.Abstract;

public class Ques2 extends Ques1 {

	

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method implimented in subclass");
		
	}
	public void callAbstractMethod() {
		Ques2 obj=new Ques2();
		obj.abstractMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques2 obj=new Ques2();
		obj.abstractMethod();
		obj.concreatetMethod();

	}

}
