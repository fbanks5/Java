package wguPractice;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numNectarines;
        int myMoney;
        int totalCost;

        numNectarines = scnr.nextInt();
        myMoney = scnr.nextInt();

        if (numNectarines >= 3) {
            totalCost = numNectarines * 3;
            if (totalCost <= myMoney) {
                System.out.println("Approved transaction");
            }
            else {
                System.out.println("Need more money to purchase all");
            }
        }
        else {
            System.out.println("Please purchase at least 3 nectarines");
        }
    }
}
