package ptask;

import java.util.*;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(120, 150, 200);

        boolean result = list.stream()
                             .allMatch(n -> n > 100);

        System.out.println(result);
    }
}