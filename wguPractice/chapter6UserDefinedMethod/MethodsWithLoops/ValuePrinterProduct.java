package wguPractice.chapter6UserDefinedMethod.MethodsWithLoops;

import java.util.Scanner;

public class ValuePrinterProduct {

    public static void printVal(int num1, int num2) {
        int prodVal;
        int i;

        prodVal = 1;
        for (i = num1; i <= num2; ++i) {
            prodVal *= i;
        }
        System.out.println(prodVal);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numberA;
        int numberB;

        numberA = scnr.nextInt();
        numberB = scnr.nextInt();
        printVal(numberA, numberB);
    }
}
