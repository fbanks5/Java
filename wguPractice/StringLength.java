package wguPractice;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String strInput;
        int lengthString;

        strInput = scnr.nextLine();
        lengthString = (strInput.length());

        if (strInput.charAt(lengthString - 1) == '!') {
            System.out.println("An exclamation");
        }
        else {
            System.out.println("Not an exclamation");
        }
    }
}
