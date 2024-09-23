package org.example;

import javax.swing.*;

public class Dot {
    double x;
    double y;

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Dot(double x, double y) {
        this.y = y;
        this.x = x;
    }

    public double distanceTo(Dot b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}
