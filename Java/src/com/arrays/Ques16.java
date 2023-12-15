package com.arrays;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,36,2};
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x<small) {
				small=x;
			}else if(x>large) {
				large=x;
			}
		}
		int diff=large-small;
		System.out.println("Diffrence "+ diff);

	}

}
