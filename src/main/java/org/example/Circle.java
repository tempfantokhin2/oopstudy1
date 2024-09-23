package org.example;

public class Circle {
    Dot center;
    double radius;

    public Circle(Dot center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getLength(){
        return Math.PI * 2 * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
