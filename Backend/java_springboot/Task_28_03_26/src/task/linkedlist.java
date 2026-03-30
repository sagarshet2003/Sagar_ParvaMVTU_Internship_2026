package task;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Initial List: " + list);

        // addFirst() & addLast()
        list.addFirst("HTML");
        list.addLast("JavaScript");

        System.out.println("After adding first & last: " + list);

        // remove()
        list.remove("Python");
        System.out.println("After removing Python: " + list);

        // removeFirst() & removeLast()
        list.removeFirst();
        list.removeLast();

        System.out.println("After removing first & last: " + list);

        // get()
        System.out.println("Element at index 1: " + list.get(1));

        // set()
        list.set(1, "Spring");
        System.out.println("After updating: " + list);

        // contains()
        System.out.println("Contains Java? " + list.contains("Java"));

        // size()
        System.out.println("Size of list: " + list.size());

        // iteration
        System.out.println("Iterating list:");
        for(String item : list) {
            System.out.println(item);
        }
    }
}