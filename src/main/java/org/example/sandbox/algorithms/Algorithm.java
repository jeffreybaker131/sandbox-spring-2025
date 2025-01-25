package org.example.sandbox.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {

    public static Map<Integer, Integer> map = new HashMap<>();

    // Iterative approach
    public static int fibonacci(int n) {

        if (n <= 1) {

            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {

            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    // Recursive approach
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {

            return n;
        }

        return memo(n - 1) + memo(n - 2);
    }

    private static int memo(int n) {

        if (n <= 1) {

            return n;
        }

        if (map.containsKey(n)) {

            return map.get(n);
        }

        int fib = memo(n - 1) + memo(n - 2);
        map.put(n, fib);

        return fib;
    }

    public static void main(String[] args) { // psvm

        // System.out.println(fibonacci(10)); // Output: 55
        // System.out.println(fibonacciRecursive(10)); // Output: 55

        for (int x = 0; x <= 50; x++) {

            System.out.println("Fibonacci(" + x + ") = " + fibonacciRecursive(x));
        }
    }
}