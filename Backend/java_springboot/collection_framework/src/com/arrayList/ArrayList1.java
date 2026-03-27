package com.arrayList;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	//without generics
	ArrayList al1 = new ArrayList();  //there is no type safety
	al1.add("Hello");
	al1.add(null);
	al1.add(null);
	al1.add(21);
	al1.add(34);
	System.out.println(al1);
	String greet = (String) al1.get(0); //need to type cast
}
}
