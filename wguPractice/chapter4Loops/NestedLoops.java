package wguPractice.chapter4Loops;

public class NestedLoops {
    public static void main(String[] args) {
        int row;
        int col;

        for(row = 2; row <= 3; row = row + 1) {
            for(col = 0; col <= 1; col = col + 1) {
                System.out.print("" + row + col + " ");
            }
        }
    }
}
