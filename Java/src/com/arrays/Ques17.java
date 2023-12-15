package com.arrays;

public class Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,23,36,2};
		int elem1=12;
		int elem2=23;
		
		 boolean containsElement1 = false;
	      boolean containsElement2 = false;

	        for (int num : arr) {
	            if (num == elem1) {
	                containsElement1 = true;
	            } else if (num == elem2) {
	                containsElement2 = true;
	            }

	}
	        if(containsElement1==true&&containsElement2==true) {
	        	System.out.println("Array contains both element");
	        }else {
	        	System.out.println("Array does not contain both element");
	        }

}
}
	
