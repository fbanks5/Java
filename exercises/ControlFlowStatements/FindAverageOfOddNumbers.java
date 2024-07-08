package exercises.ControlFlowStatements;

public class FindAverageOfOddNumbers {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int count = 0;

        for (int nr : nrs) {
            if (nr % 2 != 0) {
                sum += nr;
                count++;
            }
            System.out.println("Current average: " + (double) sum / count);
        }
    }
}
