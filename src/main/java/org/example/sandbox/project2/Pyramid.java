package org.example.sandbox.project2;

public class Pyramid extends Shape {

    private double length;
    private double width;
    private double height;

    public Pyramid() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double v, double w, double x) {
        super();
        this.length = v;
        this.width = w;
        this.height = x;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return length * width + length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
    }

    public double volume() {
        return (length * width * height) / 3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("Length = ").append(length);
        sb.append(", Width = ").append(width);
        sb.append(", Height = ").append(height);
        sb.append(", Surface area = ").append(surfaceArea());
        sb.append(", Volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }

}