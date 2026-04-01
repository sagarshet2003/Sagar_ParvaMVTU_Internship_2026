package com.functional_interface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
public static void main(String[] args) {
	//even or odd using predicate
	Predicate<Integer> pre = a->a%2==0;
	System.out.println(pre.test(13));
}
}
