package wguPractice.chapter6UserDefinedMethod.PrintMethods;

import java.util.Scanner;

public class printPowerOf2 {
    public static void printPowerOf2(double num1, double num2) {
        double result;

        result = Math.pow(num1, num2);
        System.out.print("Power: ");
        System.out.printf("%.1f", result);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double a;
        double b;

        a = scnr.nextDouble();
        b = scnr.nextDouble();

        printPowerOf2(a, b);
    }
}
