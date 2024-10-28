package wguPractice.chapter7DefiningAClass.Dog;

public class CallDog {
    public static void main(String[] args) {
        Dog buddy = new Dog();

        buddy.setWeightAndAge(65, 9);
        System.out.print("Human years: " + buddy.getHumanYears());
    }
}
