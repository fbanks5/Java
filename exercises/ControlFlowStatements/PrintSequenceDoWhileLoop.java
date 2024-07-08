package exercises.ControlFlowStatements;

public class PrintSequenceDoWhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= n);

    }
}
