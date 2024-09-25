package wguPractice.chapter6UserDefinedMethod.MethodsWithLoops;

import java.util.Scanner;

public class ValuePrinterOnlyNegative {

    public static void outputValue(int num1, int num2) {
        int i;
        int prodVal = 1;
        boolean hasNegative = false;

        for (i = num1; i <= num2; ++i) {
            if (i < 0) {
                prodVal *= i;
                hasNegative = true;
            }
        }

        if (!hasNegative) {
            prodVal = 1;
        }

        System.out.println(prodVal);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number1;
        int number2;

        number1 = scnr.nextInt();
        number2 = scnr.nextInt();
        outputValue(number1, number2);
    }
}
