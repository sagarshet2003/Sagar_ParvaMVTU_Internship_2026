package Task;

import java.util.Scanner;

public class Type_casting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer number:");
		int number = sc.nextInt();

		// Implicit Type Casting (int to double)
		double d = number;

		// Explicit Type Casting (double to int)
		int n = (int) d;

		System.out.println("Original Integer Value: " + number);
		System.out.println("After Implicit (int to double): " + d);
		System.out.println("After Explicit (double to int): " + n);

		sc.close();
	}
}