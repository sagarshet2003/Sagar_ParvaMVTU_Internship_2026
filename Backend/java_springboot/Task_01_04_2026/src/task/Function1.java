package task;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {

        Function<String, Integer> length = s -> s.length();

        System.out.println("Length: " + length.apply("Java 8"));
    }
}