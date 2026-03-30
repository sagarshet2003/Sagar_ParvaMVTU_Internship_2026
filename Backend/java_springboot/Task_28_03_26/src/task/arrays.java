package task;

import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating array
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array
        System.out.println("Array elements:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting
        Arrays.sort(arr);
        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        // Searching (binary search requires sorted array)
        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if(index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        // Copy array
        int copy[] = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        sc.close();
    }
}