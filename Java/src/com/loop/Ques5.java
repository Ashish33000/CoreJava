package com.loop;

public class Ques5 {

	public static void main(String[] args) {
		
		int num1 = 25;
        int num2 = 15;
        int num3 = 30;

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);

	}

}
