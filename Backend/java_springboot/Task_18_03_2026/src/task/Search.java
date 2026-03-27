package task;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        boolean found = false;

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        for(int i = 0; i < 5; i++) {
            if(arr[i] == key) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Not Found");
        }
    }
}