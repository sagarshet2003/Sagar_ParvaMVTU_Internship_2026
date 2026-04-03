package tasks;

import java.util.*;
import java.util.stream.*;

public class all_num_great_100 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(120, 150, 200, 130);

        boolean result = list.stream()
                             .allMatch(n -> n > 100);

        System.out.println("All numbers > 100: " + result);
    }
}