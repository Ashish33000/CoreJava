package com.Interface;

public class Ques10 {
	public static void main(String[] args) {
		MyInterface9 obj=new Myclass7();
		obj.interfaceMethod();
		System.out.println("public"+obj.Public);
		System.out.println("private"+obj.getPrivateField());
		System.out.println("protected"+obj.getProtectedField());
		
	}

}
