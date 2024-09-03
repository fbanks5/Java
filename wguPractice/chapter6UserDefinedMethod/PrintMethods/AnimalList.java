package wguPractice.chapter6UserDefinedMethod.PrintMethods;

import java.util.Scanner;

public class AnimalList {
    public static void printAnimalsList(String animal1, String animal2, String animal3) {
        System.out.println("Animals: ");
        System.out.println("1: " + animal1);
        System.out.println("2: " + animal2);
        System.out.println("3: " + animal3);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String animal1;
        String animal2;
        String animal3;

        animal1 = scnr.next();
        animal2 = scnr.next();
        animal3 = scnr.next();

        printAnimalsList(animal1, animal2, animal3);
    }
}
