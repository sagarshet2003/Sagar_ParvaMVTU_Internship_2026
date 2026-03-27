package com.super_final;

class Person{
	public final void display() {
		System.out.println("Parent class display");
	}
}

class Student extends Person{

	@Override
	public void display() {
		System.out.println("Child class display");
	}
	
	
	
}

public class FinalKeyWord {
	public static void main(String[] args) {
		/*
		 * final keyword:
		 * =============
		 * 1. variables
		 * 2. methods
		 * 3. class
		 */
		final int age;
		age = 30;
		System.out.println("Age: "+age);
		age = 40;
		System.out.println("Age: "+age);
		
//		final int age = 30;
//		age = 40;
		
		
		Student s1 = new Student();
		s1.display();
		
		
	}
}