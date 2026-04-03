package tasks;

import java.util.*;
import java.util.stream.*;

public class num_greater_100 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 50, 120, 30, 80);

        boolean result = list.stream()
                             .anyMatch(n -> n > 100);

        System.out.println("Any number > 100: " + result);
    }
}