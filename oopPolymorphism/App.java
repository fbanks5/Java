package oopPolymorphism;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();


//        dog = new Cat();

        dog.eat();
        dog.eat("meat");
        cat.eat();

        System.out.println(Dog.type);
        System.out.println(Cat.type);




    }
}
