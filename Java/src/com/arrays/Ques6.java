package com.arrays;

import java.util.Arrays;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int n=arr.length;
		int[] res=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			res[j++]=arr[i];
			
		}
		System.out.println("Coppied Array "+Arrays.toString(arr));

	}

}
