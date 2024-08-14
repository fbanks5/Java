package wguPractice;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput; // User input
        int result;

        result = 0;
        userInput = scnr.nextInt();

        while (userInput != 10) {
            result = result + userInput;
            System.out.println("Result: " + result);
            userInput = scnr.nextInt();
        }
        System.out.println(result);
    }
}

