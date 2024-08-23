package wguPractice.test;

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double purchaseAmount = scnr.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

    }
}
