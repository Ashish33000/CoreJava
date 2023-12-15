package com.Static;

public class Ques1 {
	// Static variables
     static int staticVar1 = 10;
     static String staticVar2 = "Ashish";

    // Instance variables
     int instanceVar1 = 20;
    String instanceVar2 = "Kumar";

    // Static methods
    static void staticMethod1() {
        System.out.println("static method 1 Value: " + staticVar1);
    }

     static void staticMethod2() {
        System.out.println("static method 2  Value: " + staticVar2);
    }

    // Instance methods
    void instanceMethod1() {
        System.out.println("instance method 1   Value : " + instanceVar1);
    }

    void instanceMethod2() {
        System.out.println("instance method 2  Value : " + instanceVar2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod1();
        staticMethod2();

        Ques1 obj = new Ques1();
        obj.instanceMethod1();
        obj.instanceMethod2();

	}

}
