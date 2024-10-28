package wguPractice.ch6Labs;

import java.util.Scanner;

public class SortAnArray {
   public static void sortArray(int[] myArr, int arrSize) {
       for (int i = 0; i < arrSize - 1; ++i) {
           for (int j = 0; j < arrSize - i - 1; ++j) {
               if (myArr[j] < myArr[j + 1]) {
                   int tempVal = myArr[j];
                   myArr[j] = myArr[j + 1];
                   myArr[j + 1] = tempVal;
               }
           }
       }
   }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int[] myArr = new int[arrSize];

        for (int i = 0; i < arrSize; ++i) {
            myArr[i] = scnr.nextInt();  
        }

        sortArray(myArr, arrSize);

        for (int i = 0; i < arrSize; ++i) {
            System.out.print(myArr[i] + ", ");
        }
        System.out.println();
    }
}



