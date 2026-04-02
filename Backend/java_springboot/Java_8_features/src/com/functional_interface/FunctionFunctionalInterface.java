package com.functional_interface;

import java.util.function.Function;

public class FunctionFunctionalInterface {
	public static void main(String[] args) {
		Function<String, Integer> fun = s ->s.length();
		int res = fun.apply("Hello World");
		System.out.println("Res: "+res);
	}

}