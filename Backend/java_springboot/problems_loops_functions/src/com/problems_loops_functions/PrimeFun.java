package com.problems_loops_functions;

import java.util.Scanner;

public class PrimeFun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		prime(num);
	}
	
	public static void prime(int num) {
		boolean flag = true;
		for(int i=2; i<=num; i++) {
			if(num%i==0) { //5%2==0
				flag = false;
			}
		}
		if(flag)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
	
}
