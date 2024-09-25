package wguPractice.chapter6UserDefinedMethod.PerfectSizeArrays;

import java.util.Arrays;

public class JoinArrays {

    public static double[] joinArrays (double[] firstArray, double[] secondArray) {
        // The length of the new array is the sum of the lengths of the two arrays
        double[] resultArray = new double[firstArray.length + secondArray.length];
        int index;

        // Copy the first array into the result array
        for (index = 0; index < firstArray.length; ++index) {
            resultArray[index] = firstArray[index];
        }

        // Copy the second array into the result array, remember to put them in result after
        // the elements of the first array
        for (index = 0; index < secondArray.length; ++index) {
            resultArray[index + firstArray.length] = secondArray[index];
        }

        // Return the result array
        return resultArray;
    }

    public static void main(String[] args) {
        double[] mondayTemps = {85.3, 88.6, 90.0, 87.2}; // perfect sized array
        double[] tuesdayTemps = {87.1, 89.8, 92.0, 88.4}; // perfect sized array

        // The toString() method in the Arrays class returns a String containing
        // the elements of the array separated by commas in square brackets
        // Alternatively, a for loop coudl be used to print the array contents
        System.out.println("The temperatures on Monday were: " + Arrays.toString(mondayTemps));
        System.out.println("The temperarures on Tuesday were: " + Arrays.toString(tuesdayTemps));

        double[] earlyWeekTemps = joinArrays(mondayTemps, tuesdayTemps);

        System.out.println("The temperatures for Monday and Tuesday were: " + Arrays.toString(earlyWeekTemps));
    }
}
