package com.operator;

import java.util.Scanner;

public class Ques4 {
	 public  boolean isNumEqual(int num1, int num2) {
    return num1 == num2;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4 q=new Ques4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		if(q.isNumEqual(num1, num2)) {
			System.out.println("Number is equal");
		}else {
			System.out.println("Number is not equal5");
		}

	}

}
