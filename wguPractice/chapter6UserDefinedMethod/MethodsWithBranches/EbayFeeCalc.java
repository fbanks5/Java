package wguPractice.chapter6UserDefinedMethod.MethodsWithBranches;

/* Returns fee charged by ebay.com given the selling price of fixed-price books, movies, music, or video games.
    Fee is $0.50 to list plus a % of the selling price: 13% for $50.00 or less plus 5% for $50.01 to $1000.00 plus 2% for
      $1000.01 or more

   Note: double variables are not normally used for dollars/cents due to the internal representation's precision, but
   are used here for simplicity.
 */

import java.util.Scanner;

public class EbayFeeCalc {
    public static double calcEbayFee(double sellPrice) {
        final double BASE_LIST_FEE = 0.50;      // Listing Fee
        final double PERC_50_OR_LESS = 0.13;    // % $50 of less
        final double PERC_50_TO_1000 = 0.05;    // % $50.01 to $1000
        final double PERC_1000_OR_MORE = 0.02;  // % $1000.01 or more
        double feeTot;                          // Resulting eBay fee

        feeTot = BASE_LIST_FEE;

        // Determine additional fee based on selling price
        if (sellPrice <= 50.00) {
            feeTot = feeTot + (sellPrice * PERC_50_OR_LESS);
        }
        else if (sellPrice <= 1000.00) {
            feeTot += (50 * PERC_50_OR_LESS) + ((sellPrice - 50) * PERC_50_TO_1000);
        }
        else {
            feeTot += (50 * PERC_50_OR_LESS) + ((1000 - 50) * PERC_50_TO_1000) + ((sellPrice - 1000) * PERC_1000_OR_MORE);
        }

        return feeTot;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double sellingPrice;    // User defined selling price

        // Prompt user for selling price
        System.out.print("Enter item selling price (e.g., 65.00): ");
        sellingPrice = scnr.nextDouble();
        System.out.println("eBay fee: " + calcEbayFee(sellingPrice));
    }
}
