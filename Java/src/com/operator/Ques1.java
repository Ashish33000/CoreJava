package com.operator;

public class Ques1 {
	public double function(double n1,double n2,char operator) {
		double res=0.0;
		
		switch(operator) {
		  case '+':
              res = n1 + n2;
              break;
          case '-':
              res = n1-n2;
              break;
          case '*':
              res = n1 * n2;
              break;
          case '/':
              if (n2 != 0) {
                  res = n1 / n2;
              } else {
                  System.out.println("Cannot divide by zero");
              }
              break;
          default:
              System.out.println("Invalid operator");
      }

      return res;
      
		}
	
	public static void main(String[] args) {
		double num1=10.5;
		double num2=2.6;
		Ques1 q=new Ques1();
		System.out.println("Addition "+q.function(num1, num2, '+'));
		System.out.println("Subtraction "+q.function(num1, num2, '-'));
		System.out.println("Multiplication "+q.function(num1, num2, '*'));
		System.out.println("Division "+q.function(num1, num2, '/'));
	}

}
