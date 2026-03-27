package com.abstraction;

abstract class Person{
	public abstract void isWalking();
	public void isSleeping() {
		System.out.println("Person is sleeping");
	}
}

class Student extends Person{
	
	public void isWalking() {
		System.out.println("Student is sleeping");
	}
}

public class Abstraction1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.isSleeping();
		s1.isWalking();
	}

}
