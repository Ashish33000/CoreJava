package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,36,2};
		Set<Integer>set=new HashSet<>();
		for(int a:arr) {
			set.add(a);
		}
		int[] res=new int[set.size()];
		int j=0;
		for(int x:set) {
			res[j++]=x;
		}
		System.out.println(Arrays.toString(res));

	}

}
