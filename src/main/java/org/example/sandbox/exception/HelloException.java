package org.example.sandbox.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        // Try-catch:
        try {
            // Do something.
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Do something else.

        // Try-catch-catch - Order of catch blocks matters per hierarchy:
        try {
            // Do something awesome!
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Do something.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Finally do something.
        }

        try {
            // Do something.
        } finally {
            // Do something.
        }

        // Java 7 multi-try-catch:
        try {
            // Do something.
        } catch (ArithmeticException | NullPointerException | SecurityException e) {
            e.printStackTrace();
        }

        // Try-with-resources:
        try(Scanner scanner1 = new Scanner(System.in)) {
            // Do something.
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

    }

}