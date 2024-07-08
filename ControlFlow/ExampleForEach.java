package ControlFlow;

public class ExampleForEach {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for(int nr : nrs) {
            System.out.println(nr);
            sum += nr;
        }
        System.out.println("Sum: " + sum);
    }
}
