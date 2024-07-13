package workingwithstrings;



public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Frantz");
        sb.append(" is a software engineer");
        String s = sb.toString();
        System.out.println(s);


        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", ");
        sb1.append("World");
        sb1.append("!");
        String greeting = sb1.toString();
        System.out.println(greeting);
    }
}
