package wguPractice.ch6Labs;

import java.util.Scanner;

public class SwappingVariables {
    public static void swapValues(int[] values) {
        if (values.length > 1) {
            int tempVal = values[0];
            values[0] = values[1];
            values[1] = tempVal;
            int otherTempVal = values[2];
            values[2] = values[3];
            values[3] = otherTempVal;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElem = 4;
        int[] values = new int[numElem];
        int i;

        for (i = 0; i < values.length; ++i) {
            values[i] = scnr.nextInt();
        }
        swapValues(values);

        for (i = 0; i < values.length; ++i) {
            System.out.print(values[i]);
            if (i < values.length -1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
