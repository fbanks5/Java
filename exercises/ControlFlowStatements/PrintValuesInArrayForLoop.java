package exercises.ControlFlowStatements;

public class PrintValuesInArrayForLoop {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5};
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Value at index " + i + ": " + nrs[i]);
        }
    }
}
