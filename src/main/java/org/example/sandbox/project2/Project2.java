package org.example.sandbox.project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {

        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape pyramid = new Pyramid(4.0, 3.0, 2.0);
        ThreeDimensionalShape sphere = new Sphere(2.0);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(pyramid);
        shapes.add(sphere);

        shapes.forEach(System.out::println);

    }

}