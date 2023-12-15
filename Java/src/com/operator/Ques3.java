package com.operator;

public class Ques3 {
	
    public  boolean isEqual(int num1, int num2) {
        return num1 == num2;
    }

    // Method to check inequality using !=
    public boolean isNotEqual(int num1, int num2) {
        return num1 != num2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3 q=new Ques3(); 
		System.out.println(q.isEqual(1, 1));
		System.out.println(q.isNotEqual(2,2));

	}

}
