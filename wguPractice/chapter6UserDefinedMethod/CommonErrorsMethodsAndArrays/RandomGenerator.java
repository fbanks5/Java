package wguPractice.chapter6UserDefinedMethod.CommonErrorsMethodsAndArrays;

public class RandomGenerator {
    public static int[] generateRandom(int lower, int upper, int length) {
       int[] arrayReference = new int[length];
        int index;

        for (index = 0; index < arrayReference.length; ++index) {
            arrayReference[index] = (int) (Math.random() * (upper - lower + 1) + lower);
        }

        return arrayReference;
    }
}
