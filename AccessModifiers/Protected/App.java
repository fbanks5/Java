package AccessModifiers.Protected;

public class App {
    protected static void main(String[] args) {
        Person p = new Person();
        p.name = "Paul";
        p.sayHi();
    }
}
