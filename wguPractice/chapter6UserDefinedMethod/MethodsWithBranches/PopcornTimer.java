package wguPractice.chapter6UserDefinedMethod.MethodsWithBranches;

import java.util.Scanner;

public class PopcornTimer {
    public static void printPopcornTime(int bagOunces) {

        if (bagOunces < 2) {
            System.out.println("Too small");
        }
        else if (bagOunces > 10) {
            System.out.println("Too large");
        }
        else {
            System.out.println((bagOunces * 6) + " seconds");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userOunces;

        userOunces = scnr.nextInt();
        printPopcornTime(userOunces);
    }
}
