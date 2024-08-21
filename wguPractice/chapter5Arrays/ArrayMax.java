package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8; // Number of elements
        int[] userVals = new int[NUM_ELEMENTS];
        int i;
        int maxVal;

        // Prompt user to populate array
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");

        // Populate array
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println(userVals[i]);
        }
        // Determine max
        maxVal = userVals[0];
        // Compare each value to max
        for (i = 0; i < userVals.length; ++i) {
            if (userVals[i] > maxVal) {
                maxVal = userVals[i];
            }
        }
        System.out.println("Max: " + maxVal);// Output max
    }
}
