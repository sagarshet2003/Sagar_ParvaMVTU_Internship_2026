package com.exception_handling;

import java.util.Scanner;

public class ExceptionHandling6 {
public static void main(String[] args) {
	int age = 10;
	try {
		validate(age);
	} catch(Exception e) {
		System.out.println(e.getMessage());
	} finally {
		System.out.println("program completed");
	}
}

private static void validate(int age) {
	if(age>=18) {
		System.out.println("your age is valid");
	}else {
		throw new ArithmeticException("invalid age number");
	}
}
}
