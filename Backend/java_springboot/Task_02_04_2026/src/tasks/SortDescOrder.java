package tasks;

import java.util.*;
import java.util.stream.*;

public class SortDescOrder {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);

        list.stream()
            .sorted((a, b) -> b - a) 
            .forEach(System.out::println);
    }
}