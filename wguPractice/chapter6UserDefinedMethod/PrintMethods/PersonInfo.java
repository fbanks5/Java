package wguPractice.chapter6UserDefinedMethod.PrintMethods;

import java.util.Scanner;

public class PersonInfo {
    public static void printPersonInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String personName;
        int personAge;

        personName = scnr.next();
        personAge = scnr.nextInt();

        printPersonInfo(personName, personAge);
    }
}
