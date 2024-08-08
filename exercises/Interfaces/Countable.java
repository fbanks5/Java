package exercises.Interfaces;

public interface Countable {
    default void printInfo() {
        System.out.println("Countable");
    }
}
