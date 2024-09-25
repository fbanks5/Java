package wguPractice.chapter6UserDefinedMethod.CommonErrorsMethodsAndArrays;

import java.util.Arrays;

public class CommonArrayElementUsingCopy {
    public static String findMostFrequent(String[] arrayReference) {
        String mostCommon;
        int times;      // Number of times the current element has been found
        int mostTimes;  // Number of times the most common element has been found
        int index;
        String[] arrayCopy;

        if (arrayReference.length == 0) {
            return null;
        }

        // Make a copy of the arrayReference to avoid a side effect
        arrayCopy = Arrays.copyOf(arrayReference, arrayReference.length);
        Arrays.sort(arrayCopy); // Sort the array copy

        mostCommon = arrayCopy[0]; // Make sure method works with 1-element array
        times = 0;
        mostTimes = 0;

        // Have to start loop at one in order to use index - 1
        for (index = 1; index < arrayCopy.length; ++index) {

            // The next element matches the last one
            if (arrayCopy[index - 1].equals(arrayCopy[index])) {
                ++times;
            }
            else {  // new element was found, restart the count
                times = 0;
            }

            // Check to see if old element was most common so far
            if (times > mostTimes) {
                mostTimes = times;
                mostCommon = arrayCopy[index];
            }
        }

        return mostCommon;
    }
}
