package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class DoubleDown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;

        // Prompt user to input values one at a time
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }
        // Double the values
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = userVals[i] * 2;
        }
        // Print the new values
        System.out.println("New numbers: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.println(userVals[i] + " ");
        }
    }
}
