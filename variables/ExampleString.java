package variables;

public class ExampleString {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hello";
        boolean same = s.equals(s1);
        System.out.println(same);
        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        s = s.toUpperCase();


        String subString = s1.substring(1, 4);
        System.out.println(subString);

        boolean startsWith = s.startsWith("H");
        boolean startsWith1 = s1.startsWith("h");
        System.out.println(startsWith);
        System.out.println(startsWith1);

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
    }
}
