package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class NegativeToZeroCopy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;                     // Number of elements
        int[] userVals = new int[NUM_ELEMENTS];         // User numbers
        int[] copiedVals = new int[NUM_ELEMENTS];       // Newly copied numbers
        int i;                                          // Loop index

        System.out.println("Enter " + NUM_ELEMENTS + " integer values one at a time...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }

        // Convert userVals to copiedVals
        for (i = 0; i < userVals.length; ++i) {
            copiedVals[i] = userVals[i];
        }

        // Convert negatives to 0 in copiedVals
        for (i = 0; i < copiedVals.length; ++i) {
            if (copiedVals[i] < 0) {
                copiedVals[i] = 0;
            }
        }

        // Print numbers
        System.out.println("\nOriginal and new values: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.println(userVals[i] + " became " + copiedVals[i]);
        }
        System.out.println();

    }
}
