package com.exception_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling1 {
public static void main(String[] args) throws FileNotFoundException {
	//1st ways
	try { 
		PrintWriter pw = new PrintWriter("hello.txt");
		pw.write("Hello world");
		System.out.println("completed");
		pw.close();
	}catch (FileNotFoundException e) {
		//3 ways
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e);
	}
	
	//2nd way
	PrintWriter pw = new PrintWriter("world.txt");
	pw.write("Hello world");
	System.out.println("completed1");
	pw.close();
}
}
