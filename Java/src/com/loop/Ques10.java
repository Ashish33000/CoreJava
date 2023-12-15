package com.loop;

public class Ques10 {
	public void ispalindrome(int n) {
		int rev=0;
	  int temp=n;
		while(n>0) {
		       int rem=n%10;
	            n = n/10;	            
	            rev = rev*10 + rem;
		}
		if(rev==temp) {
			System.out.println("number is palindrome ");
		}else {
			System.out.println("number is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques10 q=new Ques10();
		q.ispalindrome(121);
	}

}
