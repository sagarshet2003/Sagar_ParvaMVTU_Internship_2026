package com.setInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetInterface2 {
public static void main(String[] args) {
	Set<Integer> s1 =new HashSet<Integer>();
	s1.add(12);
	s1.add(14);
	s1.add(12);
	s1.add(14);
//	s1.add(null);
	s1.add(100);
//	s1.add(null);
//	
for(int ele:s1) {
	System.out.println(ele+" ");
}
System.out.println();
s1.forEach((ele)->System.out.print(ele+" "));

System.out.println();

Iterator<Integer> iterator = s1.iterator(); //ctrl+2,L
while(iterator.hasNext()) {
	System.out.println(iterator.next()+" ");
}
}
}
