package com.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapInterface {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "Hello");
	map.put(2, "Hello");
	map.put(3, "Hello");
	map.put(4, "pavan");
	map.put(null, "Hello");
	map.put(null, "darshan");
	map.put(1, "Hunter");
	System.out.println(map);
	
	map.forEach((k,v)->System.out.print(k+ " -> "+v));
	
	Set<Map.Entry<Integer, String >> entrySet = map.entrySet();
	for(Map.Entry<Integer, String> keyValue: entrySet) {
		System.out.println(keyValue);
	}
	
	Set<Integer> keySet = map.keySet();
	for(int key : keySet) {
		System.out.println(key+ " "+map.get(key));
	}
	
}
}
