package wguPractice;

import java.util.Scanner;

public class AppendString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        String userInput;

        userText = scnr.nextLine();
        userInput = scnr.nextLine();

        userText = userText.concat(" ");
        userText = userText.concat(userInput);
        userText = userText.concat(".");

        System.out.println(userText);
    }
}
