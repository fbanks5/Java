package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int SCORES_SIZE = 4;
        int[] lowerScores = new int[SCORES_SIZE];
        int i;

        // Input scores
        for (i = 0; i < lowerScores.length; ++i) {
            lowerScores[i] = scnr.nextInt();
        }

        // Subtract 1 from each score and assign to lowerScores
        for (i = 0; i < lowerScores.length; ++i) {
            lowerScores[i] = lowerScores[i] - 1;
            if (lowerScores[i] < 0) {
                lowerScores[i] = 0;
            }
        }

        // Output lowerScores
        for (i = 0; i < lowerScores.length; ++i) {
            System.out.print(lowerScores[i] + " ");
        }
        System.out.println();
    }
}
