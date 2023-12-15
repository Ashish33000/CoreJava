package com.Inhertance;

public class Main {
	public static void main(String[] args) {
		A objA = new A();
        B objB = new B();
        C objC = new C();
     
        objA.methodA1();
        objA.commonMethod();

  
        objB.methodB1();
        objB.commonMethod();

        
        objC.methodC1();
        objC.commonMethod();


        A ref1 = new B();
        A ref2 = new C();

        ref1.commonMethod();
        ref2.commonMethod();
	}

}
