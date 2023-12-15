package com.arrays;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4};
		int target=6;
	     int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				
			}
			
		} 
		
		if(index >=0) {
			System.out.println("index "+index);
		}else {
			System.out.println("Target element not present");
		}
		

	}

}
