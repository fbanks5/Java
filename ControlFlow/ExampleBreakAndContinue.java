package ControlFlow;

public class ExampleBreakAndContinue {   // create a class
    public static void main(String[] args) {    // main method
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};    // create an array of numbers
        for (int nr : nrs) {        // for each number in the array
            if (nr % 2 != 0) {      // if the number is odd, skip it and continue with the next number in the array
                System.out.println(nr);   // print the number
            }
            }

    }
}
