package wguPractice.chapter6UserDefinedMethod.ArrayParameters;

import java.util.Scanner;

public class SwapFirstAndLast {

    public static void swapArrayEnds(int[] sortArray) {
       if (sortArray.length > 1) {
           int tempVal = sortArray[0];
           sortArray[0] = sortArray[sortArray.length - 1];
              sortArray[sortArray.length - 1] = tempVal;
       }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElem = 4;
        int[] sortArray = new int[numElem];
        int i;
        int userNum;

        for (i = 0; i < sortArray.length; ++i) {
            sortArray[i] = scnr.nextInt();
        }
        swapArrayEnds(sortArray);

        for (i = 0; i < sortArray.length; ++i) {
            System.out.print(sortArray[i]);
            if (i < sortArray.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

