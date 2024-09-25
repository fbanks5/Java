package wguPractice.ch3Labs;

import java.util.Scanner;

public class LoginName {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        String modifiedLoginName;
        int birthYear;

        firstName = scnr.next();
        lastName = scnr.next();
        birthYear = scnr.nextInt();
        modifiedLoginName = firstName.substring(0, firstName.length() - 1);

        if (firstName.length() > 6) {
            System.out.println("Your login name: " + modifiedLoginName + lastName.charAt(0) + "_" + birthYear % 10);
        }
        else {
            System.out.println("Your login name: " + firstName + lastName.charAt(0) + "_" + birthYear % 10);
        }
    }

}
