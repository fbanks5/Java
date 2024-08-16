package wguPractice.chapter4Loops;

import java.util.Scanner;

public class DomainNamePrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char letter1;
        char letter2;
        char digit;

        System.out.println("Two-letter domain names:");

        letter1 = 'a';
        while (letter1 <= 'z') {
            letter2 = 'a';
            while (letter2 <= 'z') {
                System.out.println("" + letter1 + "" + letter2 + ".com");
                ++letter2;
            }
            digit = '0';
            while (digit <= '9') {
                System.out.println("" + letter1 + "" + digit + ".com");
                ++digit;
            }
            ++letter1;
        }
    }
}



