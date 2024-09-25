package wguPractice.chapter6UserDefinedMethod.MethodWithOversizeArrays;

import java.util.Arrays;

public class RemovingElements {
    public static int removeFirst(int[] arrayRef, int arraySize, int targetVal) {
        boolean targetFound;
        int index;

        targetFound = false;

        for (index = 0; index < arraySize; ++index) {
            // If matching element found, move each element one to the left
            if (targetFound) {
                arrayRef[index - 1] = arrayRef[index];
            }
            // If matching element found, set targetFound to true
            if (arrayRef[index] == targetVal) {
                targetFound = true;
            }

        }
        // If matching element found, array size is one element smaller
        // otherwise array size hasn't changed
        if (targetFound) {
            return arraySize - 1;
        } else {
            return arraySize;
        }
    }

    public static void main(String[] args) {
        int[] onlineSales = {4, 3, 1, 4, 3, 9};
        int onlineSalesSize = 6;

        onlineSalesSize = removeFirst(onlineSales, onlineSalesSize, 4);
        onlineSalesSize = removeFirst(onlineSales, onlineSalesSize, 4);
        System.out.println(Arrays.toString(onlineSales));
    }
}
