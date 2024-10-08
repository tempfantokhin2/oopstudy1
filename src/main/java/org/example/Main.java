package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        example2();
    }

    public static void example1() {
        Dot zero = new Dot(0, 0);
        Dot pointQ = new Dot(100, 0);

        System.out.println("zero = " + zero);
        System.out.println("pontQ = " + pointQ);

        Circle circ1 = new Circle(pointQ, 95);
        Circle circ2 = new Circle(new Dot(3, 4), 7);
        Circle circ3 = new Circle(8, 12, 4.7);

        System.out.println("circ1 = " + circ1);
        System.out.println("circ2 = " + circ2);
        System.out.println("circ3 = " + circ3);

        Tringle pif = new Tringle(zero, new Dot(4, 0), new Dot(0, 3));
        System.out.println("pif = " + pif);

        System.out.println(circ3.getArea());
    }

    public static void example2() {
        Dot zero = new Dot(0, 0);
        Dot pointQ = new Dot(100, 0);
        //...
        Circle cZ = new Circle(zero, 50);
        Circle cQ = new Circle(pointQ, 45);
        System.out.println(cQ + "пересекаеться с " + cZ + ": " + cQ.intersectsWith(cZ));
        Circle cP = new Circle(new Dot(80, 0), 40);
        System.out.println(cP + "пересекаеться с " + cZ + ": " + cP.intersectsWith(cZ));
        //...
    }
}
