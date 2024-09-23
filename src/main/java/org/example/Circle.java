package org.example;

/**
 * Represents a circle with a center point and radius.
 */
public class Circle {
    Dot center;
    double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "center=(" + center + ")" +
                ", radius=" + radius +
                '}';
    }

    public Circle(Dot center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new Dot(x, y);
        this.radius = radius;
    }

    public double getLength(){
        return Math.PI * 2 * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
