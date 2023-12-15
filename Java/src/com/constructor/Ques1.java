package com.constructor;
class Myclass{
	int value1;
	int value2;
	//default constructor
	Myclass(){
		System.out.println("Defqault constructor");
		value1=0;
		value2=0;
		
	}
	// constructor with one argument
	Myclass(int v1){
		System.out.println("one argument constructor");
		value1=v1;
		value2=0;
		
	
}
	// constructor with two argument
		Myclass(int v1,int v2){
			System.out.println("two argument constructor");
			value1=v1;
			value2=v2;
			
		
	
}
}
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass obj1=new Myclass();
		Myclass obj2=new Myclass(5);
		Myclass obj3=new Myclass(6,7);
		

	}

}
