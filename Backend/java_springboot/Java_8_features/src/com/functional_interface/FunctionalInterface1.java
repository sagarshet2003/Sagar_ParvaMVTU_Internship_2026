package com.functional_interface;

@FunctionalInterface
interface MyInterface{
	void display();
}

public class FunctionalInterface1 {
public static void main(String[] args) {
	MyInterface i = ()->{System.out.println("Hello world");};
	i.display();
}
}
