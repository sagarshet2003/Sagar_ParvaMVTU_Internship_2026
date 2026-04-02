package com.functional_interface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
public static void main(String[] args) {
	Consumer<String> con = s->System.out.println("Res:"+s.length());
	con.accept("Hello world");
}
}
