package exercises.StringAndStringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(sb + " " + sb2);

        // Compare the two StringBuilder objects using equals method
        System.out.println("Using equals: " + sb.toString().equals(sb2.toString()));

        // Compare the two StringBuilder objects using append method
        System.out.println("Append: " + sb.append(sb2));

        // Compare the two StringBuilder objects using reverse method
        System.out.println("Reverse: " + sb.reverse());

    }
}
