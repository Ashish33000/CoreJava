package com.arrays;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,36,2};
		int even=0;
		int odd=0;
		for(int x:arr) {
			if(x%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even "+even+" odd: "+odd);

	}

}
