package wguPractice.chapter6UserDefinedMethod.ComparePerfectAndOversizeArrays;

public class PerfectSizeArrayExample {

    // Method uses a perfect-size array
    public static String[] addElement(String[] arrayRef, String addMe) {
        String[] returnArray = new String[arrayRef.length + 1];
        int index;

        // Copy the array elements to the new array
        for (index = 0; index < arrayRef.length; ++index) {
            returnArray[index] = arrayRef[index];
        }

        // Add the new element to the new array
        returnArray[arrayRef.length] = addMe;

        return returnArray;
    }

    // Method uses oversize array
    public static int addElement(String[] arrayRef, int currentSize, String addMe) {
        if (currentSize == arrayRef.length) return currentSize;

        arrayRef[currentSize] = addMe;
        ++currentSize;

        return currentSize;
    }
}
