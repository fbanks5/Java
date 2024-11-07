package wguPractice.ch7Labs.LAB6;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        int purchaseAmount;
        int restockAmount;

        purchaseAmount = scnr.nextInt();
        restockAmount = scnr.nextInt();

        vm.purchase(purchaseAmount);
        vm.restock(restockAmount);
        vm.report();


    }
}
