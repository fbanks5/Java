package wguPractice.chapter6UserDefinedMethod.MethodsWithBranches;

import java.util.Scanner;

public class ShippingCost {
    // Determine shipping tax on cost
    public static double calcTax(double cost) {
        return cost * 0.15;
    }

    public static double calcShippingCost(double weight) {
        double cost;

        if (weight < 1) {
            cost = 7.88;
        }
        else if (weight < 6) {
            cost = 14.32;
        }
        else if (weight < 10) {
            cost = 21.11;
        }
        else {
            cost = 25.5;
        }
        cost += calcTax(cost);

        return cost;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double weightOfPackage;           // User defined weight of package

        System.out.print("Enter package weight: ");
        weightOfPackage = scnr.nextDouble();
        System.out.print("Shipping cost: ");
        System.out.printf("%.2f\n", calcShippingCost(weightOfPackage));
        System.out.println("");
    }
}
