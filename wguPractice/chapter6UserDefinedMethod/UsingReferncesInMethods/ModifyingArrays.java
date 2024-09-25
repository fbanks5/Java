package wguPractice.chapter6UserDefinedMethod.UsingReferncesInMethods;

public class ModifyingArrays {

    public static void reverse(double[] arrayReference) {
        int middle = arrayReference.length / 2; // integer division
        int index;

        // Swap mirrored elements of the array
        for (index = 0; index < middle; ++index) {
            double temp = arrayReference[index];

            // -1 below because length is unit indexed
            arrayReference[index] = arrayReference[arrayReference.length - index - 1];
            arrayReference[arrayReference.length - index - 1] = temp;
        }
    }

    public static void main(String[] args) {
        double[] diameterTires = new double[4];
        diameterTires[3] = 26.5;
        reverse(diameterTires);

        System.out.print("The diameters of the tires in reverse order are: ");
        for (int i = 0; i < diameterTires.length; ++i) {
            System.out.print(diameterTires[i] + " ");
        }
    }
}
