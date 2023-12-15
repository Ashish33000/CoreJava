package com.arrays;

import java.util.Arrays;

public class Ques5 {

	public static void main(String[] args) {
		int[] arr= {12,10,16,5,2,6,4};
		int target=1582;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
				
			}
			
		}
	
		if(count==0) {
			System.out.println(Arrays.toString(arr));
		}else {
			int[] res=new int[arr.length-count];
			int j=0;
			for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != target) {
	                res[j++] = arr[i];
	            }
	        }
			System.out.println(Arrays.toString(res));
		}
	

	}

}
