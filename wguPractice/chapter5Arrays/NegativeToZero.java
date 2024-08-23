package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class NegativeToZero {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;

        // Prompt user to input values one at a time
        System.out.println("Enter " + NUM_ELEMENTS + " integer values one at a time...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }
        // Convert negatives to 0
        for (i = 0; i < userVals.length; ++i) {
            if (userVals[i] < 0) {
                userVals[i] = 0;
            }
        }
        System.out.print("New numbers: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
    }
}
