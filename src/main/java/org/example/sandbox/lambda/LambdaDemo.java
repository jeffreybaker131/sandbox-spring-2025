package org.example.sandbox.lambda;

import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {

        // Anonymous function
        // x -> x * 2
        // 4 classes

        // Predicate - Takes 1 value and return a boolean:
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - Takes 1 value and return a value:
        Function<Integer, Integer> function = x -> {

            x = x + 5;
            return x * 2;

        };

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;

        // Supplier - Takes nothing and returns 1 value:
        Supplier<String> supplier = () -> "Hello World!";

        // Consumer - Takes 1 value and returns nothing:
        Consumer<String> consumer = x -> System.out.println(x);
        Consumer<String> consumer2 = System.out::println;

    }

}