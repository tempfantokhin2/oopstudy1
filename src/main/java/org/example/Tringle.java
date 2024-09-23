package org.example;

public class Tringle {
    Dot[] point;

    public Tringle(Dot point1, Dot point2, Dot point3) {
        this.point = new Dot[3];
        this.point[0] = point1;
        this.point[1] = point2;
        this.point[2] = point3;
    }

    public boolean isRectangular() {
        return false;
    }

    public boolean isIsosceles() {
        return false;
    }

    public boolean isEquilateral() {
        return false;
    }
}
