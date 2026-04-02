package task;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {

        Consumer<String> print = s -> System.out.println("Hello " + s);

        print.accept("Sagar");
    }
}