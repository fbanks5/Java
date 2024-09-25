package wguPractice.chapter6UserDefinedMethod.ReturningArraysFromMethods;

public class ResizingArrays {

    public static int[] repeat(int[] sourceArray) {
        int[] resultArray = new int[sourceArray.length * 2];
        int index;

        for (index = 0; index < sourceArray.length; ++index) {
            resultArray[index] = sourceArray[index];
            resultArray[index + sourceArray.length] = sourceArray[index];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        originalArray = repeat(originalArray);
        System.out.println(originalArray.length);
    }
}
