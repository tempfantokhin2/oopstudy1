package org.example;

import java.util.Arrays;

/**
 * Represents a tringle with two points.
 */
public class Tringle {
    Dot[] point;

    @Override
    public String toString() {
        return "Tringle{" +
                "(" + point[0] + "), " +
                "(" + point[1] + "), " +
                "(" + point[2] + ")" +
                '}';
    }

    public Tringle(Dot point1, Dot point2, Dot point3) {
        this.point = new Dot[3];
        this.point[0] = point1;
        this.point[1] = point2;
        this.point[2] = point3;
    }

    public boolean isRectangular() {
        // Check if three sides form a right angle
        return isRightAngle(point[0], point[1], point[2]) ||
                isRightAngle(point[0], point[2], point[1]) ||
                isRightAngle(point[1], point[2], point[0]);
    }

    public boolean isIsosceles() {
        // Check if two sides are equal
        return (point[0].distanceTo(point[1]) == point[1].distanceTo(point[2])) ||
                (point[0].distanceTo(point[2]) == point[1].distanceTo(point[2])) ||
                (point[0].distanceTo(point[2]) == point[1].distanceTo(point[0]));
    }

    public boolean isEquilateral() {
        // Check if all three sides are equal
        return point[0].distanceTo(point[1]) == point[1].distanceTo(point[2]) &&
                point[0].distanceTo(point[2]) == point[1].distanceTo(point[0]) &&
                point[0].distanceTo(point[2]) == point[1].distanceTo(point[0]);
    }

    private boolean isRightAngle(Dot a, Dot b, Dot c) {
        // Calculate vectors
        double ax = a.x - b.x;
        double ay = a.y - b.y;
        double bx = b.x - c.x;
        double by = b.y - c.y;

        // Check if dot product equals zero
        return (ax * bx + ay * by) == 0;
    }
}
