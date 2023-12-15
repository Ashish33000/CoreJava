package com.Inhertance;

public class C extends B {
	void methodC1() {
        System.out.println("Method specific to class C: methodC1");
    }

    @Override
    void commonMethod() {
        System.out.println("Override method in class C");
    }

}
