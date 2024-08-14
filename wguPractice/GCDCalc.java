package wguPractice;

import java.util.Scanner;

public class GCDCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numA;
        int numB;

        System.out.println("Enter first positive number: ");
        numA = scnr.nextInt();

        System.out.println("Enter second positive number: ");
        numB = scnr.nextInt();

        while (numA != numB) {
            if (numB > numA) {
                numB = numB - numA;
            }
            else {
                numA = numA - numB;
            }
        }
        System.out.println("GCD: " + numA);
    }
}
