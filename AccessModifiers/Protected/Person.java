package AccessModifiers.Protected;

public class Person {
    protected String name;

    private String secret;

    protected void sayHi() {
        System.out.println("Hi, my name is " + name);
    }

    private void saySecret() {
        System.out.println("My secret is " + secret);
    }
}
