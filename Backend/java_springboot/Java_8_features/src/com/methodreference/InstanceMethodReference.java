package com.methodreference;

import java.util.function.Supplier;

public class InstanceMethodReference {
	public String getMessage() {
		return "Instance method";
	}
	
	public static void main(String[] args) {
		InstanceMethodReference obj1 = new InstanceMethodReference();
		//without
		Supplier<String> sup = ()->obj1.getMessage();
		System.out.println("Res: "+sup.get());
		//with
		Supplier<String> sup2 = obj1::getMessage;
		System.out.println("Res: "+sup2.get());
	}
}
