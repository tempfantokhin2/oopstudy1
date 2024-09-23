package org.example;

import javax.swing.*;

public class Dot {
    double x;
    double y;

    public Dot(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double distanceTo(Dot b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}
