package com.methodreference;

import java.util.function.Consumer;

public class StaticMethodReference {
public static void printMessage(String message) {
	System.out.println("Your message is : "+ message);
}
public static void main(String[] args) {
	//without static method reference
	Consumer<String > cons1 = s->StaticMethodReference.printMessage(s);
	cons1.accept("Hello world");
	//with static method reference
	Consumer<String > cons2 = StaticMethodReference::printMessage;
	cons2.accept("Hello world");
}
}
