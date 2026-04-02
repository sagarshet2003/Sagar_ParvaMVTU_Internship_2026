package com.functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
public static void main(String[] args) {
	Supplier<Integer> random = () -> new Random().nextInt();
	System.out.println(random.get());
}
}
