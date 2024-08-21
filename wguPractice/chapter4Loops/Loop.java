package wguPractice.chapter4Loops;

public class Loop {
    public static void main(String[] args) {
        int x = 5;
        int y = 18;

        while (y >= x) {
            System.out.print(y + " ");
            y = y - x;
        }
    }
}
