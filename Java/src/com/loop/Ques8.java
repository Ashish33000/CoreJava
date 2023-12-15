package com.loop;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int number = 183; 

	        int originalNumber, remainder, result = 0;
	        originalNumber = number;

	        
	        int numberOfDigits = String.valueOf(number).length();

	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, numberOfDigits);
	            originalNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	}

}
