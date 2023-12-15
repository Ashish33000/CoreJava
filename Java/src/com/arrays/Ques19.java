package com.arrays;

public class Ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,16,17,18,19,20, 98, 99, 100};
        int n=arr.length+1;
        int total=(n*(n+1))/2;
        int sum=0;
        for(int x:arr) {
        	sum+=x;
        }
        System.out.println(total-sum);
	}

}
