package task;

import java.util.*;

public class liked_arrays_comb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // ARRAY OPERATIONS
        // =========================
        System.out.println("----- ARRAY OPERATIONS -----");

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print
        System.out.println("Array elements:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sum
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("\nSum: " + sum);

        // Average
        double avg = (double) sum / n;
        System.out.println("Average: " + avg);

        // Max & Min
        int max = arr[0], min = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Sorting
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);
        if(index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        // Copy
        int copy[] = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));


        // =========================
        // LINKEDLIST OPERATIONS
        // =========================
        System.out.println("\n----- LINKEDLIST OPERATIONS -----");

        LinkedList<String> list = new LinkedList<>();

        // Input for LinkedList
        System.out.print("Enter number of elements in LinkedList: ");
        int m = sc.nextInt();
        sc.nextLine(); // important

        System.out.println("Enter elements:");
        for(int i = 0; i < m; i++) {
            list.add(sc.nextLine());
        }

        // Print list
        System.out.println("LinkedList elements: " + list);

        // addFirst & addLast
        list.addFirst("FirstElement");
        list.addLast("LastElement");
        System.out.println("After addFirst & addLast: " + list);

        // remove
        if(!list.isEmpty()) {
            list.removeFirst();
            list.removeLast();
        }
        System.out.println("After removeFirst & removeLast: " + list);

        // get element
        if(list.size() > 0) {
            System.out.println("Element at index 0: " + list.get(0));
        }

        // set element
        if(list.size() > 0) {
            list.set(0, "UpdatedElement");
            System.out.println("After update: " + list);
        }

        // contains
        System.out.print("Enter element to check: ");
        String check = sc.nextLine();
        System.out.println("Contains? " + list.contains(check));

        // size
        System.out.println("Size of LinkedList: " + list.size());

        // iteration
        System.out.println("Iterating LinkedList:");
        for(String item : list) {
            System.out.println(item);
        }

        sc.close();
    }
}