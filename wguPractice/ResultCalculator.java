package wguPractice;

import java.util.Scanner;

public class ResultCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int valueIn;
        int outputVal;

        outputVal = 0;
        valueIn = scnr.nextInt();

        while (valueIn >= 0) {
            if (valueIn % 2 == 0) {
                outputVal = outputVal - valueIn;
                System.out.println(outputVal);
            }
            else {
                outputVal = outputVal + valueIn;
                System.out.println(outputVal);
            }
            valueIn = scnr.nextInt();
        }

        System.out.println("Output value is " + outputVal);
    }
}


