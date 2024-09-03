package wguPractice.chapter6UserDefinedMethod.UserDefinedMethodsBasics.PizzaExamples;

public class MultiplePizzaAreas {
    public static double calcPizzaArea(double pizzaDiameter) {
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        return pizzaArea;
    }

    public static void main(String[] args) {
        System.out.println("12.0 inch pizza is " + calcPizzaArea(12) + " inches squared");
        System.out.println("16.0 inch pizza is " + calcPizzaArea(16) + " inches squared");
    }
}
