package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class StudentScoresRotated {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int SCORES_SIZE = 4;
        int[] oldScores = new int[SCORES_SIZE];
        int[] newScores = new int[SCORES_SIZE];
        int i;



        // Input oldScores
        System.out.println("Enter " + SCORES_SIZE + "  old scores...");
        for (i = 0; i < oldScores.length; ++i) {
            oldScores[i] = scnr.nextInt();
        }

        // Rotate oldScores to newScores
        for (i = 0; i < oldScores.length; ++i) {
            if (i == 0) {
                newScores[0] = oldScores[1];
                newScores[1] = oldScores[2];
                newScores[2] = oldScores[3];
                newScores[3] = oldScores[0];
            }
        }

        // Output newScores
        for (i = 0; i < newScores.length; ++i) {
            System.out.print(newScores[i] + " ");
        }
        System.out.println();

    }
}
