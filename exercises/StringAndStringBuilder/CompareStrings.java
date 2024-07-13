package exercises.StringAndStringBuilder;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
//        System.out.println("Using equals: " + str1.equals(str2));

        String compare = str1.equals(str2) ? "are equal" : "are not equal";
        System.out.println("The strings " + compare);
    }
}
