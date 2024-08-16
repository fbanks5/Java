package wguPractice.chapter4Loops;

import java.util.Scanner;

public class IndentText {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();

        for (i = 0; i <= userNum; ++i) {
            for (j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
