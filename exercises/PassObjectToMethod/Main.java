package exercises.PassObjectToMethod;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Harold";
        person.age = 56;
        System.out.println("Before: " + person.name + ", " + person.age);
        modifyPerson(person);
        System.out.println("After: " + person.name + ", " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Chris";
        p.age = 30;
    }
}
