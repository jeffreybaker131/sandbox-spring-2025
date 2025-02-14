package org.example.sandbox.project2;

public class Sphere extends Shape {

    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("Radius = ").append(radius);
        sb.append(", Surface area = ").append(surfaceArea());
        sb.append(", Volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }

}