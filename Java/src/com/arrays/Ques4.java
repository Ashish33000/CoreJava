package com.arrays;

public class Ques4 {

	public static void main(String[] args) {
		int[] arr= {12,10,16,5,2,6,4};
		int target=6;
	    boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				flag=true;
				
			}
			
		} 
		
		if(flag) {
			System.out.println("Element is present in an array");
		}else {
			System.out.println("Target element not present");
		}

	}

}
