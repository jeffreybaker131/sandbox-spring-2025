package org.example.sandbox.factory;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) throws Exception {
        Box box = Factory.getInstance(Box.class);
        System.out.println(box);
    }

}