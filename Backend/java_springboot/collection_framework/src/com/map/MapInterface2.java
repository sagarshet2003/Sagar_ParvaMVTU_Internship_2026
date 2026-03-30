package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Hello");
        map.put(2, "Hello");
        map.put(3, "Hello");
        map.put(4, "sagar");
        map.put(1, "Hunter"); 

      
        System.out.println(map);

        map.forEach((k, v) -> System.out.print(k + " -> " + v + " "));
        System.out.println();

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> key : entrySet) {
            System.out.println(key);
        }
    }
}