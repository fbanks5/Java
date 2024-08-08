package interfaces;

public class Fox extends Mammal implements Predator, Prey{
    @Override
    public void catchAndEat() {
        System.out.println("Fox is catching and eating its prey");
    }

    @Override
    public void runAndHide() {
        System.out.println("Fox is running and hiding from a predator");
    }

    @Override
    public void run() {
        System.out.println("Fox is running");
    }

    public void breathe() {
        System.out.println("Fox is breathing");
    }
}
