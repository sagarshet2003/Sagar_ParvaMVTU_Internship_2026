package com.exception_handling;

import java.util.Scanner;

public class ExceptionHandling5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	try {
		String str = null;
		System.out.println("result: "+str.toString());
		int res =num1/num2;
		System.out.println("result:"+res);
	} catch (ArithmeticException e) {
		System.out.println("Exception: "+e.getMessage());
	}
	catch (Exception e){
		System.out.println("Exception :"+e.getMessage());
	} finally {
		sc.close();
	}
}
}
