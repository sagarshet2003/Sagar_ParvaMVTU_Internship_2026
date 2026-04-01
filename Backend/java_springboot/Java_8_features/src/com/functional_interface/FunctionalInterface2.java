package com.functional_interface;

@FunctionalInterface
interface AddTwoNumbers{
	int add(int a, int b);
}

public class FunctionalInterface2 {
public static void main(String[] args) {
	AddTwoNumbers add_two = (a,b)-> a+b;
	int res = add_two.add(12, 34);
	System.out.println("Result:"+res);
}
}
