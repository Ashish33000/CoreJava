package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,10,16,5,2,6,4,10,36,2};
		int n=arr.length;
		boolean flag=false;
		Map<Integer,Integer> map=new HashMap<>();
		for(int x:arr) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
				flag=true;
			}else {
				map.put(x, 1);
			}
		}
		
	
		if(flag) {
			System.out.println("Array have duplicate value");
			for(Map.Entry<Integer, Integer> e:map.entrySet()) {
				if(e.getValue()>1) {
					System.out.println(e.getKey()+" count "+e.getValue());
				}
			}
		}else {
			System.out.println("No duplicate value");
		}

	}

}
