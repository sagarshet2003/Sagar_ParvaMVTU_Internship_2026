package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(10);
	al1.add(20);
	al1.add(2);
	al1.add(12);
	al1.add(23);
	al1.add(8);
	al1.add(0);
	System.out.println(al1);
	
	//for loop(index based)
	for(int i=0; i<al1.size(); i++) {
		System.out.println(al1.get(i)+" ");
	}
	System.out.println();
	System.out.println("------------------------------------");
	
	
	//for-each(enhanced for loop)
	for(int ele: al1) {
		System.out.println(ele+" ");
	}
	
	System.out.println();
	System.out.println("------------------------------------");
	
	//ForEach
	al1.forEach((ele) ->System.out.print(ele+" "));
	
	System.out.println();
	System.out.println("------------------------------------");

	//iterator - unidirectional (forward)
	Iterator<Integer> itr = al1.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	
	System.out.println();
	System.out.println("------------------------------------");

	//ListIterator - biderectional(both forward and backward)
	ListIterator<Integer> list = al1.listIterator();
	
	while(list.hasNext()) {
		System.out.println(list.next()+" ");
	}
}
}
