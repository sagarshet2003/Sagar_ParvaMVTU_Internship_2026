package Task;

import java.util.Scanner;

public class student_grade_system {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		char grade;

		// if else if
		if(marks >= 90 && marks <= 100) {
			grade = 'A';
		}
		else if(marks >= 75) {
			grade = 'B';
		}
		else if(marks >= 60) {
			grade = 'C';
		}
		else if(marks >= 50) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}

		System.out.println("Grade: " + grade);

		// switch
		
		System.out.println("Grade Description using switch:");
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid S");
		}
		
		sc.close();
	}
}