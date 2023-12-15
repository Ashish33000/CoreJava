package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {12,10,16,5,2,6,4,10,36,2};
		int[] arr2= {16,10,16,8,2,9,4,10,38,6};
		  Set<Integer> set = new HashSet<>();
	      List<Integer> list = new ArrayList<>();
	      for(int a:arr1) {
	    	  set.add(a);
	      }
	      
	      for(int a:arr2) {
	    	  if(set.contains(a)) {
	    		  list.add(a);
	    	  }
	      }
	      if(!list.isEmpty()) {
	    	  for(int x:list)System.out.print(x+" ");
	      }else {
	    	  System.out.println("No common value found");
	      }

	}

}
