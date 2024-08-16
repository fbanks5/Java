package wguPractice.chapter4Loops;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int stop;
        int i;

        stop = scnr.nextInt();

        for (i = 0; i < 10; ++i) {
            if (i > stop) {
                System.out.println("i=" + i);
                break;
            }
            System.out.println(i);
        }
    }
}
