package com.arrays;

import java.util.Arrays;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
