package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;
        int sumVal;

        // Prompt user to populate array
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");

        // Populate array
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println("Value: " + userVals[i]);
        }

        sumVal = 0;
        for (i = 0; i < userVals.length; ++i) {
            sumVal += userVals[i];
        }
        System.out.println("Sum: " + sumVal);
    }
}
