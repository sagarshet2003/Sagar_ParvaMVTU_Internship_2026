package task;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {

        Supplier<Integer> randomNum = () -> (int)(Math.random() * 100);

        System.out.println("Random Number: " + randomNum.get());
    }
}