package task;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Adding elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            queue.add(sc.nextLine());
        }

        System.out.println("\nInitial Queue: " + queue);

        // offer() - adds element
        System.out.print("Enter element to add using offer(): ");
        String ele = sc.nextLine();
        queue.offer(ele);
        System.out.println("After offer(): " + queue);

        // peek() - view front element
        System.out.println("Front element using peek(): " + queue.peek());

        // element() - also returns front (throws exception if empty)
        System.out.println("Front element using element(): " + queue.element());

        // poll() - removes front element
        System.out.println("Removed using poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // remove() - removes front element
        if(!queue.isEmpty()) {
            System.out.println("Removed using remove(): " + queue.remove());
        }

        System.out.println("Queue after remove(): " + queue);

        // contains()
        System.out.print("Enter element to search: ");
        String search = sc.nextLine();
        System.out.println("Contains element? " + queue.contains(search));

        // size()
        System.out.println("Queue size: " + queue.size());

        // isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Iteration
        System.out.println("\nIterating Queue:");
        for(String item : queue) {
            System.out.println(item);
        }

        sc.close();
    }
}