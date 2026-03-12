package looping_statements;

import java.util.Scanner;

public class doWhileLoop {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a num:");
		int count = sc.nextInt(); //-1
		int i=1;
		do {
			System.out.println("Value: "+i); //1
			i++;  //2
		} while(i<=count); //2<=-1
	}
}
