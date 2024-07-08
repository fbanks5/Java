package ControlFlow;

import java.util.Scanner;

public class ExampleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter your name: ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } while (input.length() < 2);

    }
}
