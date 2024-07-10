package AccessModifiers.Public2;
import AccessModifiers.Public.Person;

public class AccessedFromAnotherPackage {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "James";
        person.sayHi();
    }
}
