package com.acessModifier;

class Dad{
	private Integer NumberOfSon=10;
	
	private void privateMethod() {
		System.out.println("Inside private Dad method");
	}
	private void acessPrivateMethod() {
		privateMethod();
	}
	private int getSon() {
		return NumberOfSon;
	}
	//we can acess the private method and variable within class
}
class Son extends Dad{
	//cannot acess any private method and variable because private has a limit to acess within class
}

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Dad obj=new Dad();
	//cant aceess any private method in main class
		
	

	}

}
