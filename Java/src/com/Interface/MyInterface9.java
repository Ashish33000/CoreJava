package com.Interface;

public interface MyInterface9 {
	
    String Public = "public field";

  
    default String getPrivateField() {
        return "Private field";
    }

    default String getProtectedField() {
        return "Protected Field";
    }

    void interfaceMethod();
	

}
