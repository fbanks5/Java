package exercises.AccessModifiers.PPDP;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("Name is: " + p.name);
        System.out.println("Age is: " + p.age);
        System.out.println("Address is: " + p.address);
        // Cannot access private field ssn from outside the class
        // System.out.println("SSN is: " + p.ssn);
    }
}
