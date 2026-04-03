package tasks;

import java.util.*;
import java.util.stream.*;

public class FindSecMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);

        int secondMax = list.stream()
                            .distinct()              
                            .sorted((a, b) -> b - a) 
                            .skip(1)   
                            .findFirst()             
                            .get();

        System.out.println("Second Max: " + secondMax);
    }
}