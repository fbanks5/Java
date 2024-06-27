package variables;

public class ExampleArray {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nrs[0]);
        nrs[4] = 10;
        System.out.println(nrs[4]);
        System.out.println(nrs.length);
    }
}
