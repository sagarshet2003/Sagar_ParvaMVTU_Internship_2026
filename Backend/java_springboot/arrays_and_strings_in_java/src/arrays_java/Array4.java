package arrays_java;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int [2][3];
		
		System.out.println("eneter elements");
		//nested for loop
		for(int i=0; i<=1; i++) {//row
			for(int j=0; j<=1; j++) {//col
				System.out.println("enter ["+i+"]["+j+"] ele");
				arr[i][j]=sc.nextInt();			
			}
		}
		
		//print
		for(int i=0; i<=1; i++) {//row
			for(int j=0; j<=1; j++) {//col
				System.out.print(arr[i][j]+" ");
	}
		}
			System.out.println();
		}
}