package wguPractice.chapter6UserDefinedMethod.CommonErrorsMethodsAndArrays;

public class CommonArrayElementNoSorting {
    public static String findMostFrequent(String[] arrayReference) {
        String mostCommon = null;
        int mostFrequentCount = 0;
        int index;
        int count;
        int frequency;

        mostFrequentCount = 0;

        for (index = 0; index < arrayReference.length; ++index) {
            frequency = 1;

            // Count the number of times arrayReference[index] occurs in the array
            for (count = index + 1; count < arrayReference.length; ++count) {
                if (arrayReference[count].equals(arrayReference[index])) {
                    ++frequency;
                }
            }

            // Check to see if this is the most frequent element so far
            if (frequency > mostFrequentCount) {
                mostCommon = arrayReference[index];
                mostFrequentCount = frequency;
            }
        }

        return mostCommon;

    }
}
