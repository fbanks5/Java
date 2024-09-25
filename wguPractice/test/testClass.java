package wguPractice.test;

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name, and optionally your middle name, followed by your last name: ");
        String firstName = scanner.next();
        String secondName = scanner.next();
        String lastName = "";

        // Check if second input is a middle name or last name
        if (scanner.hasNext()) {
            // Middle name is present
            lastName = scanner.next();
            String middleName = secondName;  // Treat the second input as middle name
            System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        } else {
            // No middle name
            lastName = secondName;  // Treat the second input as last name
            System.out.println(lastName + ", " + firstName.charAt(0) + ".");
        }

        // Close the scanner
        scanner.close();

    }
}

