package task;

import java.util.Scanner;

public class Array_max_and_min {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    int i = 0;
    while(i <= size - 1) {
        System.out.println("Enter " + i + " element: ");
        arr[i] = sc.nextInt();
        i++;
    }

    // Assume first element as max and min
    int max = arr[0];
    int min = arr[0];

    // Loop to find max and min
    for(int j = 1; j <= size - 1; j++) {

        if(arr[j] > max) {
            max = arr[j];
        }

        if(arr[j] < min) {
            min = arr[j];
        }
    }

    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
}
}

