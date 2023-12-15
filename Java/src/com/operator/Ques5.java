package com.operator;

public class Ques5 {
	public static void main(String[] args) {
		//Logical && operatopr
		int x=5;
		int y=-6;
		if(x>0&&y>0) {
			System.out.println("Both number is positive");
		}else {
			System.out.println("Atleat one number is not +ve");
		}
		//Logical || operatopr
				int m=5;
				int n=-6;
				if(m>0||n>0) {
					System.out.println("Atleast one number is positive");
				}else {
					System.out.println("Both number is not +ve");
				}
				
				//! operator
				boolean isHero=true;
				if(!isHero) {
					System.out.println("He is not hero");
				}else {
					System.out.println("He is Hero");
				}
	}

}
