package wguPractice.ch4Labs;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read input
        char inputChar = scnr.next().charAt(0);
        String inputString = scnr.nextLine();

        // Initialize count
        int count = 0;


        // Count for occurences of inputChar in inputString

        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }

        // Print the result with correct pluralization
        if (count == 1) {
            System.out.println(count + " " + inputChar);
        }
        else {
            System.out.println(count + " " + inputChar + "'s");
        }
    }
}
