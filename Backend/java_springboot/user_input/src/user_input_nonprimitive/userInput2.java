package user_input_nonprimitive;

import java.util.Scanner;
import java.util.Arrays;

public class userInput2 {
public static void main(String[] args) {
	//array
	//scanner
	Scanner sc = new Scanner(System.in);
	int marks[] = new int[3];
	System.out.println("enter values : ");
	marks[0] = sc.nextInt();
	marks[1] = sc.nextInt();
	marks[2] = sc.nextInt();
	
	System.out.println("Array"+ Arrays.toString(marks));
}
}
