package exercises.StringAndStringBuilder;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Length: " + str.length());
        System.out.println("Upper: " + str.toUpperCase() + " " + "Lower: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7, 12));
        System.out.println("Replacement: " + str.replace("World", "Java"));


    }
}
