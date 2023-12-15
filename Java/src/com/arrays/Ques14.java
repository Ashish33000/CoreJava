package com.arrays;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,36,2};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>first) {
				second=first;
				first=x;
			}else if(x>second&&x!=first) {
				second=x;
			}
		}
		System.out.println(second);

	}

}
