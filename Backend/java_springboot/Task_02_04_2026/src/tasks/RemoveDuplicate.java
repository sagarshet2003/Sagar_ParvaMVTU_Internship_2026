package tasks;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        list.stream()
            .distinct() 
            .forEach(System.out::println);
    }
}