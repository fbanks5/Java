package wguPractice.chapter6UserDefinedMethod.UserDefinedMethodsBasics;

import java.util.Scanner;

public class MinutesToHours {
    public static double getMinutesAsHours(double origMinutes) {
        double conversion;

        conversion = origMinutes / 60.0;
        return conversion;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double minutes;

        minutes = scnr.nextDouble();

        System.out.println(minutes + " minutes, is " + getMinutesAsHours(minutes) + " hours.");
    }
}
