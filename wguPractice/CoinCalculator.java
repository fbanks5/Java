package wguPractice;

import java.util.Scanner;

public class CoinCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numQuarters = scnr.nextInt();
        int numDimes = scnr.nextInt();
        int numNickels = scnr.nextInt();
        int numPennies = scnr.nextInt();

        double dollars = (numQuarters * 0.25) + (numDimes * 0.10) + (numNickels * 0.05) + (numPennies * 0.01);

        System.out.printf("Amount: $%.2f", dollars);
    }
}
