package Task;

import java.util.Scanner;

public class student_details_userInput {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter USN:");
		String usn = sc.nextLine();
		
		System.out.println("Enter Branch:");
		String branch = sc.nextLine();
		
		System.out.println("Enter Percentage:");
		float percentage = sc.nextFloat();
		
		System.out.println("----- Student Details -----");
		System.out.println("Name: " + name);
		System.out.println("USN: " + usn);
		System.out.println("Branch: " + branch);
		System.out.println("Percentage: " + percentage);
		
		sc.close();
	}
}