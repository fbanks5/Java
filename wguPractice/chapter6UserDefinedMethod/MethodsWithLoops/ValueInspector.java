package wguPractice.chapter6UserDefinedMethod.MethodsWithLoops;

import java.util.Scanner;

public class ValueInspector {
    public static boolean inspectVals(Scanner scnr) {
        int currentVal;

        while (true) {
            currentVal = scnr.nextInt();
            if (currentVal == 0) {
                break;
            }
            if (currentVal != 100) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean completeMatch;

        completeMatch = inspectVals(scnr);
        if (completeMatch) {
            System.out.println("Complete Match");
        }
        else {
            System.out.println("At least one mismatch");
        }
    }
}
