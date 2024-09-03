package wguPractice.chapter6UserDefinedMethod.PrintMethods;

import java.util.Scanner;

public class RegionCapital {
    public static void printRegionCapital(String var1, String var2) {
        System.out.println(var1 + " is the capital of " + var2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String city1;
        String city2;
        String state1;
        String state2;

        city1 = scnr.next();
        city2 = scnr.next();
        state1 = scnr.next();
        state2 = scnr.next();

        printRegionCapital(city1, state1);
        printRegionCapital(city2, state2);
    }
}
