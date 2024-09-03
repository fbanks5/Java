package wguPractice.chapter6UserDefinedMethod.UserDefinedMethodsBasics;

import java.util.Scanner;

public class NumberCalculator {
    public static int calculateNumber(int num1, int num2) {
        int result;
        result = num1 - (2 * num2);
        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input1;
        int input2;
        int result;

        input1 = scnr.nextInt();
        input2 = scnr.nextInt();
        result = calculateNumber(input1, input2);

        System.out.println(result);
    }
}
