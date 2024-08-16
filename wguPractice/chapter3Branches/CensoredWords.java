package wguPractice.chapter3Branches;

import java.util.Scanner;

public class CensoredWords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        userInput = scnr.nextLine();
        userInput = userInput.substring(0, 4);

        if (userInput.equals("darn")) {
            System.out.println("Censored");
        }
        else {
            System.out.println(userInput);
        }

    }

}
