package wguPractice.chapter6UserDefinedMethod.UserDefinedMethodsBasics;

import java.util.Scanner;

public class CalcPyramidVolume {
    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
        double baseArea;
        double volume;

        baseArea = baseLength * baseWidth;
        volume = baseArea * pyramidHeight / 3.0;

        return volume;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
    }
}
