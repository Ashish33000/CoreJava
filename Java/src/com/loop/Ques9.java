package com.loop;

public class Ques9 {
	public void isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques9 q=new Ques9();
		q.isPrime(13);

	}

}
