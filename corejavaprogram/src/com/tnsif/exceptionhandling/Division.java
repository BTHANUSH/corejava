package com.tnsif.exceptionhandling;

public class Division {
public static void divide() {
	int a=6,b=0,c;
	try {
		System.out.println("hello");
		c=a/b;
		System.out.println("division" +c);
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("exception caught" +e.getMessage());
	}
	catch(ArithmeticException f) {
		System.out.println(f.getMessage());
	}
	finally {
		System.out.println("final result");
	}
}
}
