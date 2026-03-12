package user_input;

import java.util.Scanner;

public class user_input {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
	//double
		System.out.println("Enter your cgpa");
		double cgpa = sc.nextDouble();
		
		sc.nextLine();
		//String
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		 // Byte
        System.out.print("Enter a byte (-128 to 127): ");
        byte b = sc.nextByte();

        // Short
        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        // Float
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        //long
        System.out.println("Enter long number");
        long num = sc.nextLong();
        
        System.out.println("Results :"+ age +","+ cgpa + ","+ name + ","+b+","+s+","+f+","+num);
        
        sc.close();
	}

}
