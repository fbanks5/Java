package interfaces;

public class Ladybug extends Insect implements Prey {
    @Override
    public void runAndHide() {
        System.out.println("Ladybug is running and hiding from a predator");
    }
}
