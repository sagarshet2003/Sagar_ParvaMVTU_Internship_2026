package task;

import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        int num = 10;

        if (isEven.test(num)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}