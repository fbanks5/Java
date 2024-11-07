package wguPractice.ch7Labs.LAB2;

import java.util.Scanner;
import java.lang.Math;

// Car class with model year, purchase price, and current value
public class CarValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Car myCar = new Car(); // Create a Car object

        // Get user input for model year, purchase price, and current year
        int userYear = scnr.nextInt();
        int userPrice = scnr.nextInt();
        int userCurrentYear = scnr.nextInt();

        // Set model year, purchase price, and calculate current value
        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calcCurrentValue(userCurrentYear);

        // Print car information
        myCar.printInfo();
    }
}
