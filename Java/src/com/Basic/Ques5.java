package com.Basic;

public class Ques5 {
	int global=50;
	public void method() {
		int local=10;
		System.out.println("Global variable"+global);
		System.out.println("Local variable "+local);
	}
	public static void main(String[] args) {
	Ques5 q=new Ques5();
	q.method();
	}

}
