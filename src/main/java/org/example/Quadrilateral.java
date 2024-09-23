package org.example;

public class Quadrilateral {
    Dot[] point;

    public Quadrilateral(Dot point1, Dot point2, Dot point3, Dot point4) {
        this.point = new Dot[4];
        this.point[0] = point1;
        this.point[1] = point2;
        this.point[2] = point3;
        this.point[3] = point4;
    }

    public boolean isRectangle() {
        return false;
    }
}
