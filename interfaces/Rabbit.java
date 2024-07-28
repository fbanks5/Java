package interfaces;

public class Rabbit extends Mammal implements Prey {
    @Override
    public void runAndHide() {
        System.out.println("Rabbit is running and hiding from a predator");
    }
}
