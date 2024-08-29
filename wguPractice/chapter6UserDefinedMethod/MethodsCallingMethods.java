package wguPractice.chapter6UserDefinedMethod;

public class MethodsCallingMethods {
    public static double calcCircleArea(double circleDiameter) {
        double circleRadius;
        double circleArea;
        double piVal = 3.14159265;

        circleRadius = circleDiameter / 2.0;
        circleArea = piVal * circleRadius * circleRadius;
        return circleArea;
    }

    public static double pizzaCalories(double pizzaDiameter) {
        double totalCalories;
        double caloriesPerSquareInch = 16.7; // Regular crust pepperoni pizza

        totalCalories = calcCircleArea(pizzaDiameter) * caloriesPerSquareInch;

        return totalCalories;
    }

    public static void main(String[] args) {
        System.out.println("12 inch pizza has " + pizzaCalories(12) + " calories.");
        System.out.println("16 inch pizza has " + pizzaCalories(16) + " calories.");
    }


}
