package wguPractice;

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int dogAgeYears;

        System.out.println("Enter dog's age (in years): ");
        dogAgeYears = scnr.nextInt();

        switch (dogAgeYears) {
            case 0:
                System.out.println("That's 0..14 human years.");
                break;

            case 1:
                System.out.println("That's 15 human years.");
                break;

            case 2:
                System.out.println("That's 24 human years.");
                break;

            case 3:
                System.out.println("That's 28 human years.");
                break;

            case 4:
                System.out.println("That's 32 human years.");
                break;

            case 5:
                System.out.println("That's 37 human years.");
                break;

            case 6:
                System.out.println("That's 42 human years.");
                break;

            case 7:
                System.out.println("That's 47 human years.");
                break;

            case 8:
                System.out.println("That's 52 human years.");
                break;

            case 9:
                System.out.println("That's 57 human years.");
                break;

            case 10:
                System.out.println("That's 62 human years.");
                break;

            default:
                System.out.println("Human years unknown.");
                break;
        }
    }
}
