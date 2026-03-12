package user_input_primitive;
import java.util.Scanner;

public class userInput1 {
	public static void main(String[] args) {
		//Scanner --> to take user input
		//new --> to create object
		// class_name obj_name = new class_name();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur age:");
		byte age = sc.nextByte();
		System.out.println("Age is :"+age);
		
		System.out.println("Enter ur marks");
		float marks = sc.nextFloat();
		System.out.println("ur marks is "+ marks);
		
		System.out.println("enter gender");
		char gender = sc.next().charAt(0); //male
		System.out.println("gender is "+ gender);
		sc.nextLine();
		System.out.println("enter name:");
		// String name = sc.next(); //this will take input up to space
		String name = sc.nextLine(); //this will take input up to new line and new line
		System.out.println("name is "+ name);
		
		sc.close();
		
		
	}
}
