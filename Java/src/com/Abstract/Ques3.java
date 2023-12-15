package com.Abstract;

public class Ques3 extends Ques1 {

	

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	public void callAbstractMethod() {
		Ques2 obj=new Ques2();
		obj.abstractMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3 obj=new Ques3();

		obj.callAbstractMethod();

	}

}
