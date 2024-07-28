package interfaces;

public interface Prey {
    void runAndHide();

    default void flee(Predator h) {
        System.out.println("Fleeing" + h.getClass().getName());
    }
}
