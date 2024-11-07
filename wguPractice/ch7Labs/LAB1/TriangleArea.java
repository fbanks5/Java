package wguPractice.ch7Labs.LAB1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        //FIXME: Read and set base and height for triangle1 (use setBase() and setHeight)
        double base1 = scnr.nextDouble();
        triangle1.setBase(base1);

        double height1 = scnr.nextDouble();
        triangle1.setHeight(height1);

        //FIXME: Read and set base and height for triangle2 (use setBase() and setHeight)
        double base2 = scnr.nextDouble();
        triangle2.setBase(base2);

        double height2 = scnr.nextDouble();
        triangle2.setHeight(height2);

        System.out.println("Triangle with smaller area:");

        //FIXME: Determine smaller triangle (use getArea()) and output smaller triangle info (use printInfo())
        if (triangle1.getArea() < triangle2.getArea()) {
            triangle1.printInfo();
        }
        else {
            triangle2.printInfo();
        }
    }
}
