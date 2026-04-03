package tasks;

import java.util.*;
import java.util.stream.*;

public class FindMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);

        int max = list.stream()
                      .max((a, b) -> a - b) 
                      .get();

        System.out.println("Maximum: " + max);
    }
}