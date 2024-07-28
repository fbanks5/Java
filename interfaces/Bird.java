package interfaces;

public class Bird extends Mammal implements Predator, Prey {
    @Override
    public void catchAndEat() {
        System.out.println("Bird is catching and eating its prey");
    }

    @Override
    public void runAndHide() {
        System.out.println("Bird is running and hiding from a predator");
    }
}
