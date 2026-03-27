package com.abstraction;

interface Vehicle{
	public void start();
}

class Car implements Vehicle{
	
	public void start() {
		System.out.println("Car is Started");
	}
}

public class Abstraction2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}

}
