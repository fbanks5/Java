package wguPractice.chapter6UserDefinedMethod.MethodsWithLoops;

import java.util.Scanner;

public class HighestValFinder {

    public static int findHighestVal(Scanner scnr) {
        int maxValue = Integer.MIN_VALUE;
        int currentVal;

        while (true) {
            currentVal = scnr.nextInt();
            if (currentVal < 0) {
                break;
            }
            if (currentVal > maxValue) {
                maxValue = currentVal;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxVal;

        maxVal = findHighestVal(scnr);

        System.out.println(maxVal);
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//
//        // Call the method and assign the result to maxVal
//        int maxVal = findHighestVal(scnr);
//
//        // Output the maximum value
//        System.out.println("The highest value entered is: " + maxVal);
//    }
//
//    public static int findHighestVal(Scanner scnr) {
//        System.out.println("Enter integers (enter a negative number to stop):");
//
//        // Initialize the result with the first input number
//        int result = scnr.nextInt();
//
//        // Continue reading numbers until a negative number is encountered
//        while (true) {
//            int num = scnr.nextInt();
//
//            // Stop the loop when a negative number is read
//            if (num < 0) {
//                break;
//            }
//
//            // If the number is larger than the current result, update result
//            if (num > result) {
//                result = num;
//            }
//        }
//
//        // Return the largest number
//        return result;
//    }
//}