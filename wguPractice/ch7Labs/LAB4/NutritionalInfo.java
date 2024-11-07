package wguPractice.ch7Labs.LAB4;

import java.util.Scanner;

public class NutritionalInfo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        FoodItem foodItem;

        // Prompt user for food item
        String itemName = scnr.next();
        if(itemName.equals("Water") || itemName.equals("water")) {
            foodItem = new FoodItem();

            foodItem.printInfo(); // Print food item info
            System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                    foodItem.getCalories(1.0));
        }
        else {
            double amountFat = scnr.nextDouble();
            double amountCarbs = scnr.nextDouble();
            double amountProtein = scnr.nextDouble();

            foodItem = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);

            double numServings = scnr.nextDouble();

            foodItem.printInfo();
            System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                    foodItem.getCalories(1.0));

            System.out.printf("Number of calories for%.2f serving(s): %.2f\n", numServings,
                    foodItem.getCalories(numServings));
        }
    }
}
