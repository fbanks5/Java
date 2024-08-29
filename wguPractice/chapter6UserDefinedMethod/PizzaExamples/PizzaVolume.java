package wguPractice.chapter6UserDefinedMethod.PizzaExamples;

public class PizzaVolume {
    public static double calcPizzaVolume(double pizzaDiameter, double pizzaHeight) {
        double pizzaRadius;
        double pizzaArea;
        double pizzaVolume;
        double piVal = 3.14159265;

        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        pizzaVolume = pizzaArea * pizzaHeight;
        return pizzaVolume;
    }

    public static void main(String[] args) {
        System.out.println("12 inch pizza with 0.5 inch height is " + calcPizzaVolume(12, 0.5) + " cubic inches");
        System.out.println("12 inch pizza with 0.8 inch height is " + calcPizzaVolume(12, 0.8) + " cubic inches");
        System.out.println("16 inch pizza with 0.8 inch height is " + calcPizzaVolume(16, 0.8) + " cubic inches");
    }
}
