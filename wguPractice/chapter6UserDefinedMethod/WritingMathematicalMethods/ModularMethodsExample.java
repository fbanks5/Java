package wguPractice.chapter6UserDefinedMethod.WritingMathematicalMethods;

import java.util.Scanner;

public class ModularMethodsExample {
    public static double calcCircularBaseArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calcCylinderVolume(double baseRadius, double height) {
        return calcCircularBaseArea(baseRadius) * height;
    }

    public static double calcCylinderSurfaceArea(double baseRadius, double height) {
        return (2 * Math.PI * baseRadius * height) + (2 * calcCircularBaseArea(baseRadius));
    }

    public static void main(String[] args) {
        double radius;
        double height;
        Scanner scnr = new Scanner(System.in);

        // Prompt user for radius
        System.out.println("Enter base radius: ");
        radius = scnr.nextDouble();

        // Prompt user for height
        System.out.println("Enter height: ");
        height = scnr.nextDouble();

        // Output the cylinder volume result
        System.out.print("Cylinder volume: ");
        System.out.printf("%.1f\n", calcCylinderVolume(radius, height));

        // Output the cylinder surface area result
        System.out.print("Cylinder surface area: ");
        System.out.printf("%.1f\n", calcCylinderSurfaceArea(radius, height));
    }
}
