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
        return isParallel(point[0], point[1], point[2], point[3]) &&
                isParallel(point[0], point[2], point[1], point[3]);
    }

    private boolean isParallel(Dot a, Dot b, Dot c, Dot d) {
        double ax = a.x - b.x;
        double ay = a.y - b.y;
        double bx = c.x - d.x;
        double by = c.y - d.y;

        return (ax * bx + ay * by) == 0;
    }
}
