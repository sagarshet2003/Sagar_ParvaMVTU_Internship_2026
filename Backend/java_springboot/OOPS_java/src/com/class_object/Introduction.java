package com.class_object;

class Car{
	//properties
	String name = "Tesla";
	long price = 10000;
	
	//behaviour
	public void canDrive() {
		System.out.println("yes");
	}
}

public class Introduction {
	public static void main(String[] args) {
		//1. Class:
		//=============
		
		Car c = new Car();
		System.out.println("Name: "+c.name);
		System.out.println("Price: "+c.price);
		c.canDrive();
	}
}
