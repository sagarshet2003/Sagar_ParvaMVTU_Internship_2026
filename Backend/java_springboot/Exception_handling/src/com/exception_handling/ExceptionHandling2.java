package com.exception_handling;

import java.util.Scanner;

public class ExceptionHandling2 {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println("Result: "+ res);
		sc.close();
	} catch (ArithmeticException e) {
		e.printStackTrace();//complete details
		System.out.println("----------------");
		System.out.println(e.getMessage());
		System.out.println("----------------");
		System.out.println(e);
		
	}
	
	try {
		int arr[] = {1,2,3};
		System.out.println("first:" + arr[1]);
		System.out.println(arr[6]);
		System.out.println("3rd value: "+arr[2]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("end of program");
}
}

