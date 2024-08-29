package wguPractice.ch5Labs;

import java.util.Scanner;

public class OutputReverse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20]; // List of numbers from input
        int numElements; // Number of elements in user's list
        int i; // Loop index
        int tempVal;

        // Prompt user to input number of elements
        numElements = scnr.nextInt();

        // Prompt user to input values one at a time
        System.out.println("Enter up to 20 integers. Enter 0 to end the input.");
        for (i = 0; i < userList.length; ++i) {
            if (numElements > 0) {
                userList[i] = scnr.nextInt();
                System.out.print(userList[i] + ", ");
            }
            System.out.println();
        }
        for (i = 0; i < (userList.length / 2); ++i) {

        }

    }
}

