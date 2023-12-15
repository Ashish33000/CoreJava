package com.String;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Ashish";
		String str2="Ashish";
		String str3=new String("Ashish");
		System.out.println(str1==str2);//true

		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
	}

}
