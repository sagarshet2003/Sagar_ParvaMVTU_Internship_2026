package arrays_java;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		int i = 0;
		while(i<=size-1) {
			System.out.println("Enter"+ i + "element: ");
			arr[i] = sc.nextInt();
			i++;
		}
		
		int res=0;
		
		for(int j=0; j<size-1; j++) {
			res = res +arr[j];
			//res+=arr[j]; //arr[o]
		}
		System.out.println("Res: "+res);
		
	}
}
