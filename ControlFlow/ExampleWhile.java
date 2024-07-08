package ControlFlow;

public class ExampleWhile {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound) {
            int randomNr = (int) (Math.random() * 11);
            System.out.println("Searching..." + randomNr);
            if (randomNr == 10) {
                notFound = false;
                System.out.println("Found it!");
                break;
            }

        }
    }
}
