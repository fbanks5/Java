package wguPractice.chapter6UserDefinedMethod.MethodsWithLoops;

import java.util.Scanner;

public class ValuePrinterSum {
    public static void printVal(int num1, int num2) {
        int i;


        int sum = 0;
        // Loop through the range of numbers from num1 to num2
        for (i = num1; i <= num2; ++i) {
            sum += i;


        }
        System.out.println(sum); // Print the sum of the numbers in the range of num1 to num2
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number1;
        int number2;

        number1 = scnr.nextInt();
        number2 = scnr.nextInt();
        printVal(number1, number2);

    }
}
