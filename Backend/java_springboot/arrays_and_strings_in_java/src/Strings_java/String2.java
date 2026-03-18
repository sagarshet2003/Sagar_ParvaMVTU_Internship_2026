package Strings_java;

public class String2 {
public static void main(String[] args) {
	String str1 = "hello";
	String str2 = new String("Hello");//heap
	String str3 = "hello";
	String str4 = new String("hello");//heap
	
	System.out.println("str1 . str2: "+str1.equals(str2));
	System.out.println("str1==str2: "+(str1==str2));
	System.out.println("str1==str3 :"+(str1==str3));
	System.out.println("str2==str4 :"+(str2==str4));
	
	System.out.println("str1 comp str3"+str1.compareTo(str3));
}
}
