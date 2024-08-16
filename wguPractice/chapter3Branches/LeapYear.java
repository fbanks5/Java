package wguPractice.chapter3Branches;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;

        isLeapYear = false;
        inputYear = scnr.nextInt();

        if (inputYear % 400 == 0) {
            isLeapYear = true;
            System.out.println(inputYear + " - leap year");
        }
        else if (inputYear % 100 == 0) {
            isLeapYear = false;
            System.out.println(inputYear + " - not a leap year");
        }
        else if (inputYear % 4 == 0) {
            isLeapYear = true;
            System.out.println(inputYear + " - leap year");
        }
        else {
            System.out.println(inputYear + " - not a leap year");
        }

    }
}
