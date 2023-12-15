package com.Interface;

public class Ques1 implements MyInterface {
	
	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("Method implemented from the interface");
		
	}
	
	
	public static void main(String[] args) {
		MyInterface obj=new Ques1();
		obj.interfaceMethod();
		
	}

	

}
