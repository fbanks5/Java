package AccessModifiers.Default;

public class Person {
    String name;

    String secret;


    void sayHi() {
        System.out.println("Hi, my name is " + name);
        saySecret();
    }

    private void saySecret() {
        System.out.println("My secret is " + secret);
    }
}
