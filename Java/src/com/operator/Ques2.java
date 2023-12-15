package com.operator;

public class Ques2 {
	public int Preincreament(int num) {
		return ++num;
	}
	public int Predecrement(int num) {
		return --num;
	}
	public int Postincreament(int num) {
		return num++;
	}
	public int Postecrement(int num) {
		return num--;
	}
 public static void main(String[] args) {
	 int n=5;
	Ques2 q=new Ques2();
	System.out.println("original value "+n);
	System.out.println("increment "+q.Postincreament(n));
	System.out.println("increment "+q.Preincreament(n));
	System.out.println("original value "+n);
	System.out.println("Decreament "+q.Postecrement(n));
	System.out.println("Decreament "+q.Predecrement(n));
}
}
