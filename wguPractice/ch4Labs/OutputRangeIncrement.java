package wguPractice.ch4Labs;

import java.util.Scanner;

public class OutputRangeIncrement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstVal;
        int secondVal;

        firstVal = scnr.nextInt();
        secondVal = scnr.nextInt();


        if (firstVal > secondVal) {
            System.out.print("Second integer can't be less than or equal to the first integer.");
        }
        else {
            while (firstVal <= secondVal) {
                System.out.print(firstVal + " ");
                firstVal += 5;
            }
        }
    }
}



