package com.exception_handling;

public class ExceptionHandling3 {
public static void main(String[] args) {
//	System.out.println("start of program");
//	try {
//		System.out.println("res: "+(10/0));
//	} finally {
//		System.out.println("this is fnally block");
//	}
//	System.out.println("end of progarm");
	
	System.out.println("start of program");
	try {
		System.out.println("res: "+(10/0));
	}catch(ArithmeticException e ) {
		System.out.println(e.getMessage());
	}
		finally {
		System.out.println("this is fnally block");
	}
	System.out.println("end of progarm");
}
}
