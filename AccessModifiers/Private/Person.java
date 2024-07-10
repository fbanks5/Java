package AccessModifiers.Private;

public class Person {
    public String name;

    private String secret;


    public void sayHi() {
        System.out.println("Hi, my name is " + name);
    }

    private void saySecret() {
            System.out.println("My secret is " + secret);
    }
}