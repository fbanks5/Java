package wguPractice.chapter6UserDefinedMethod.ReturningArraysFromMethods;

public class ReturningArrays {

    public static String[] resize(String[] arrayReference, int newSize) {
        String[] resultArray = new String[newSize];
        int index;
        int numToCopy;

        // Determine the number of array elements to copy
        numToCopy = Math.min(newSize, arrayReference.length);

        // Copy elements from arrayReference to resultArray
        for (index = 0; index < numToCopy; ++index) {
            resultArray[index] = arrayReference[index];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        String[] originalArray = {"apple", "banana", "cherry", "date", "elderberry"};
        originalArray = resize(originalArray, 10);

        for (int i = 0; i < originalArray.length; ++i) {
            System.out.print(originalArray[i] + " ");
        }
    }
}