package com.constructor;
class Demo{
	  private int value1;
	  protected int value2;
	  public int value3;
	  //Default constructor
	  Demo(){
		  System.out.println("This is default constructor");
		  value1=0;
		  value2=0;
		  value3=0;
	  }
	//private constructor
	private  Demo(int v1){
		  System.out.println("This is private constructor");
		  value1=v1;
		  value2=0;
		  value3=0;
	  }
	//protected constructor
	  Demo(int v1,int v2){
		  System.out.println("This is protected constructor");
		  value1=v1;
		  value2=v2;
		  value3=0;
	  }
	//public constructor
	  Demo(int v1,int v2,int v3){
		  System.out.println("This is public constructor");
		  value1=0;
		  value2=0;
		  value3=v3;
	  }
}
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj1=new Demo();
//		Demo obj2=new Demo(10); private and protected will not complle
//		Demo obj3=new Demo(12,13);
		Demo obj4=new Demo(12,13,14);
		

	}

}
