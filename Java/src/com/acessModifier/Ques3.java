package com.acessModifier;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected obj=new Protected();
		System.out.println("Protected varibale acess "+obj.var);
	
		obj.protectedMethod();
		System.out.println("*********************");
		Subclass obj2=new Subclass();
		obj2.acessProtectedClass();
		//we can acess protected acess modifier in subclass in same package

	}

}
