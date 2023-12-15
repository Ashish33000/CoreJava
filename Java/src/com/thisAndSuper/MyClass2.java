package com.thisAndSuper;

public class MyClass2 {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public void displayNumber() {
		System.out.println("Display number: "+this.num);
	}
	public void nmethod(int num) {
		
		
		this.setNum(num);
		this.displayNumber();
	}

}
