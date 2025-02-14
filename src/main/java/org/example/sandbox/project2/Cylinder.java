package org.example.sandbox.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double v, double w) {
        super();
        this.height = v;
        this.radius = w;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2 * (Math.PI * radius * height + Math.PI * Math.pow(radius, 2));
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("Height = ").append(height);
        sb.append(", Radius = ").append(radius);
        sb.append(", Surface area = ").append(surfaceArea());
        sb.append(", Volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }

}