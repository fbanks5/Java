package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class SumOfExcess {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4;
        int[] testGrades = new int[NUM_VALS];
        int i;
        int sumExtra;

        for(i = 0; i < testGrades.length; ++i) {
            testGrades[i] = scnr.nextInt();
        }

        sumExtra = 0;
        for (i = 0; i < testGrades.length; ++i) {
            if (testGrades[i] > 100) {
                sumExtra += testGrades[i] - 100;
            }
        }
        System.out.println("Sum of extra credit: " + sumExtra);
    }
}
