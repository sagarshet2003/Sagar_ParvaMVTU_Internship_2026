package tasks;

import java.util.*;
import java.util.stream.*;

public class ConcatList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "is", "fun");

        String result = list.stream()
                            .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);
    }
}