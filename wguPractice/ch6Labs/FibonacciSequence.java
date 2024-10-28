package wguPractice.ch6Labs;

import java.util.Scanner;

public class FibonacciSequence {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        int num1 = 0;
        int num2 = 1;
        int sumOfPrevTwo;


        for (int i = 0; i < n; i++) {
            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;


        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int lastIndexValue = fibonacci(n);
        System.out.println("fibonacci(" + n + ") is " + lastIndexValue);
    }

}