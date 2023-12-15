package com.arrays;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int a:arr) {
		if(max<a) {
			max=a;
		}else if (min>a) {
			min=a;
		}
		}
		
		System.out.println("Maximum "+max);
		System.out.println("Minimum "+min);

	}

}
