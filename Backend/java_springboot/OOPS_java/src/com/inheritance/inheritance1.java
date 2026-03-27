package com.inheritance;

class Parent{
	int age = 40;
	public void parent() {
		System.out.println("This is a parent class method");
	}
}

class Child extends Parent{
	public void child() {
		System.out.println("This a child class emthod");
	}
}

public class inheritance1 {
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println("age"+c1.age);
		c1.parent();
		c1.child();
	}

}
