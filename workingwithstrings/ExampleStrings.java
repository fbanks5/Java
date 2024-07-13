package workingwithstrings;

public class ExampleStrings {
    public static void main(String[] args) {
        String str = "Hi, all!";
        int length = str.length();
        System.out.println("The length of the string is: " + length);
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("Hi"));
        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 6));
        System.out.println(str.toUpperCase() + " " + str.toLowerCase());

        String str1 = "   Hello, World!   ";
        System.out.println(str1.trim());


    }
}
