package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class MoreArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;             // Number of elements
        int[] userVals = new int[NUM_ELEMENTS]; // User numbers
        int i;                                  // Loop index
        int sumVal;


        // Prompt user to populate array
        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");

        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
//            System.out.println("Value: " + userVals[i]);

            if (userVals[i] > 21) {
                System.out.println("Value: " + userVals[i]);
            }
        }
    }
}


