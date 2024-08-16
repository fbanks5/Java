package wguPractice.chapter4Loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        int firstNumber;
        int i;

        Scanner scnr = new Scanner(System.in);
        firstNumber = scnr.nextInt();

        System.out.println("Ready!");

        for (i = firstNumber; i > 0; --i) {
            System.out.println(i);

        }
        System.out.println("Blastoff!");
    }
}
