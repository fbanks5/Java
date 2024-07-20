package oop;

public class Animal {
    public String name;
    public int age;
    public int nrOfEyes = 2;


    public void eat() {
        System.out.println("Animal is eating");
    }

    public void eyes() {
        System.out.println("Animal has " + nrOfEyes + " eyes");
    }
}
