package com.generics;

class MyGenericsClass<T>{
	private T variable;
	
	public MyGenericsClass(T variable) {
		this.variable =variable;
	}

public T getVariable() {
	return variable;
}

public void SetVariable(T variable) {
	this.variable = variable;
}

public class Generics {
public static void main(String[] args) {
	MyGenericsClass<Integer> obj1 = new MyGenericsClass<>(21);
	System.out.println("Vlue: "+ obj1.getVariable());
	obj1.SetVariable(40);
	System.out.println("value2: "+obj1.getVariable());
	
	MyGenericsClass<String> obj2 = new MyGenericsClass<>("hello");
	System.out.println("Vlue: "+ obj2.getVariable());
}
}
}