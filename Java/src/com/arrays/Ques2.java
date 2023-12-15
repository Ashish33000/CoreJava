package com.arrays;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int sum=0;
		for(int s:arr) {
			sum+=s;
		}
		double avg=sum/arr.length;
		System.out.println(avg);

	}

}
