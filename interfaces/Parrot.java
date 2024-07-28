package interfaces;

public class Parrot extends Mammal implements Prey {
    @Override
    public void runAndHide() {
        System.out.println("Parrot is running and hiding from a predator");
    }
}
