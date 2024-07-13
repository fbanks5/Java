package exercises.StringAndStringBuilder;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "Hello, ";
        String s2 = s1;

        System.out.println(s1 + " " + s2);

        s1 = s1.toUpperCase();

        System.out.println(s1 + " " + s2);
    }
}
