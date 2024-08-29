package wguPractice.chapter6UserDefinedMethod;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class NumberComputation {

    public static int computeNumber(int num1) {
        int num2;
        num2 = num1 * 7;
        return num2;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;
        int result;

        input = scnr.nextInt();
        result = computeNumber(input);

        System.out.println(result);
    }
}
