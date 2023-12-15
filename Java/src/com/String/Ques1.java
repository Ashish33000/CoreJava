package com.String;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	There are diiferent m,ethod to create string
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello".concat(str2);
		StringBuilder str=new StringBuilder();
		str.append("hello world");
		String str4=str.toString();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello");
		stringBuffer.append(" World");
		String str5 = stringBuffer.toString();
		int num = 123;
		String str7 = String.valueOf(num); 


		
	}

}
