package wguPractice;

import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;

        firstName = scnr.next();
        middleName = scnr.next();
        lastName = scnr.next();

        if (middleName.equals("null")) {
            System.out.println(lastName + ", " + firstName.charAt(0) + ".");
        }
        else {
            System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        }

    }

}
