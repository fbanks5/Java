package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class ArrayReverseElem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;
        int tempVal;

        // Prompt user to input values one at a time
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }
        // Reverse array's elements
        for (i = 0; i < (userVals.length / 2); ++i) {
            tempVal = userVals[i]; // Temp for swap
            userVals[i] = userVals[userVals.length - 1 - i]; // First part of swap
            userVals[userVals.length - 1 - i] = tempVal; // Final part of swap
        }

        // Print the new values
        System.out.print("\nNew values: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
    }
}
