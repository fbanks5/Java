// Class:   CS5000 / 01
// Term:    Fall 2024
// Name:    Takeshia Banks
// Program Number: Assignment1 Programming2
// IDE:     IntelliJ
package wguPractice.test;

import java.util.Scanner;

public class DrivingCostTakeshia {
    //Program main method start
    public static void main(String[] args) {

        // Create Scanner Class
        Scanner s = new Scanner(System.in);

        // Enter miles driven
        System.out.print("Enter distance driven (miles): ");
        double milesDriven = s.nextDouble();

        // Enter fuel efficiency
        System.out.print("Enter fuel efficiency (mpg): ");
        double fuelEfficiency = s.nextDouble();

        // Enter price per gallon
        System.out.print("Enter price per gallon (dollars): ");
        double pricePerGallon = s.nextDouble();

        // Compute total trip cost
        double tripCost = (milesDriven / fuelEfficiency) * pricePerGallon;

        // Display results
        System.out.println("The distance (miles) :\t \t \t" + milesDriven);
        System.out.println("Fuel efficiency (mpg) :\t \t \t" + fuelEfficiency);
        System.out.println("Price per gallon (dollars) :\t$" + pricePerGallon);
        System.out.println("The trip cost (dollars) :\t \t$" + (int) (tripCost * 100) / 100.0);
    }
}
