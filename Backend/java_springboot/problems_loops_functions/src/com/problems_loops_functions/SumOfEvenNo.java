package com.problems_loops_functions;

import java.util.Scanner;

public class SumOfEvenNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		
		int i=1;
		int ressum= 0;
		
		while(i<=num) {
			if(i % 2 == 0) 
				ressum=ressum + i;
				i++;
		}
			System.out.println("Sum of even noo is:"+ressum);
		}
	}

