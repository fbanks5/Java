package wguPractice.chapter6UserDefinedMethod.PrintMethods;

import java.util.Scanner;

public class HeightPrinter {
    public static void printFeetInchShort(int numFeet, int numInches) {
        System.out.println(numFeet + "' " + numInches + "\"");;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userFeet;
        int userInches;

        userFeet = scnr.nextInt();
        userInches = scnr.nextInt();

        printFeetInchShort(userFeet, userInches);
    }
}
