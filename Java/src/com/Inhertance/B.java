package com.Inhertance;

public class B extends A {
	void methodB1() {
        System.out.println("Method specific to class B: methodB1");
    }

    @Override
    void commonMethod() {
        System.out.println("Override method in class B");
    }

}
