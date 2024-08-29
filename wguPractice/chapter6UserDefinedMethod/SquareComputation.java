package wguPractice.chapter6UserDefinedMethod;

public class SquareComputation {
    public static int computeSquare(int numToSquare) {
        return numToSquare * numToSquare;
    }

    public static void main(String[] args) {
        int numSquared;

        numSquared = computeSquare(5);
        System.out.println("5 squared is: " + numSquared);
    }
}
