package wguPractice;

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userAmount;
        int numDollars;
        int numQuarters;
        int numDimes;
        int numNickels;
        int numPennies;

        userAmount = scnr.nextInt();


        if (userAmount <= 0) {
            System.out.println("No change.");
        } else {
            numDollars = userAmount / 100;
            userAmount = userAmount % 100;

            numQuarters = userAmount / 25;
            userAmount = userAmount % 25;

            numDimes = userAmount / 10;
            userAmount = userAmount % 10;

            numNickels = userAmount / 5;
            userAmount = userAmount % 5;

            numPennies = userAmount / 1;
            userAmount = userAmount % 1;


            if (numDollars > 1) {
                System.out.println(numDollars + " Dollars");
            } else if (numDollars == 1) {
                System.out.println(numDollars + " Dollar");
            }
            if (numQuarters > 1) {
                System.out.println(numQuarters + " Quarters");
            } else if (numQuarters == 1) {
                System.out.println(numQuarters + " Quarter");
            }
            if (numDimes > 1) {
                System.out.println(numDimes + " Dimes");
            } else if (numDimes == 1) {
                System.out.println(numDimes + " Dime");
            }
            if (numNickels > 1) {
                System.out.println(numNickels + " Nickels");
            } else if (numNickels == 1) {
                System.out.println(numNickels + " Nickel");
            }
            if (numPennies > 1) {
                System.out.println(numPennies + " Pennies");
            } else if (numPennies == 1) {
                System.out.println(numPennies + " Penny");

            }
        }
    }
}

