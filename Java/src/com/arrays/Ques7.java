package com.arrays;

import java.util.Arrays;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int n=arr.length;
		int position=2;
		int element=65;
		if(position<0||position>n) {
			System.out.println("Invalid insertion");
		}
		int[] res=new int[n+1];
		int j=0;
		for(int i=0;i<res.length;i++) {
			if(i==position) {
				res[i]=element;
			}else {
				res[i]=arr[j++];
			}
		}
		System.out.println("Result "+Arrays.toString(res));
		

	}

}
