package wguPractice.chapter5Arrays;

import java.util.Scanner;

public class PostageCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Weights in ounces
        double[] letterWeights = {1.0, 2.0, 3.0, 3.1, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0};

        //Costs in cents (usps.com 2017)
        int[] postageCosts = {49, 70, 91, 112, 133, 154, 175, 196, 217, 238, 259, 280, 301, 322};

        double userLetterWeight;
        boolean foundWeight;
        int i;
        int nextHighestIndex = 0;

        // Prompt user to enter a letter weight
        System.out.print("Enter a letter weight (in ounces): ");
        userLetterWeight = scnr.nextDouble();

        // Postage costs is based on smallest letter weight that is greater than or equal to mailing letter weight
        foundWeight = false;

        for (i = 0; (i < letterWeights.length) && (!foundWeight); ++i) {
            if (userLetterWeight <= letterWeights[i]) {
                foundWeight = true;
                System.out.print("Postage for USPS first class mail is ");
                System.out.print(postageCosts[i]);
                System.out.println(" cents");
            }
            else if (userLetterWeight < letterWeights[i] && nextHighestIndex == 0) {
                nextHighestIndex = i;
            }
        }
        if (!foundWeight) {
            if (nextHighestIndex != -1) {
                System.out.println("The next higher weight is ");
                System.out.println(letterWeights[nextHighestIndex]);
                System.out.println("With a cost of " + postageCosts[nextHighestIndex] + " cents.");
            }
            else {
                System.out.println("Letter is too heavy for USPS first class mail.");
            }
        }
    }
}