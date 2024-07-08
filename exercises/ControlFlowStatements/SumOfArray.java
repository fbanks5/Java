package exercises.ControlFlowStatements;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int nr : nrs) {
            sum += nr;
        }
        System.out.println("Sum: " + sum);
    }
}
