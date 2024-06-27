package exercises.ObjContainingOtherObj;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person();
        owner.name = "Chris";


        Car car = new Car();
        car.model = "Chevrolet";
        car.owner = owner;

        System.out.println("Car model: " + car.model);
        System.out.println("Car owner: " + car.owner.name);

    }
}
