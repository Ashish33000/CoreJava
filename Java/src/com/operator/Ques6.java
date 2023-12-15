package com.operator;

public class Ques6 {
	public static void main(String[] args) {
		int num1 = 5;
        int num2 = 10;

        // n (<) operator
        if (num1 < num2) {
            System.out.println("num1 is less than num2.");
        } else {
            System.out.println("num1 is not less than num2.");
        }

        //(<=) operator
        if (num1 <= num2) {
            System.out.println("num1 is less than or equal to num2.");
        } else {
            System.out.println("num1 is neither less than nor equal to num2.");
        }

        // (>) operator
        if (num1 > num2) {
            System.out.println("num1 is greater than num2.");
        } else {
            System.out.println("num1 is not greater than num2.");
        }

        //  (>=) operator
        if (num1 >= num2) {
            System.out.println("num1 is greater than or equal to num2.");
        } else {
            System.out.println("num1 is neither greater than nor equal to num2.");
        }
	}

}
