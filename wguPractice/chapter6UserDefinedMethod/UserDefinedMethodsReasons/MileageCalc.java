package wguPractice.chapter6UserDefinedMethod.UserDefinedMethodsReasons;

import java.util.Scanner;

// Note the method stubs in this program. The calculateMileage method was not yet implemented.

public class MileageCalc {
    public static double convKilometersToMiles(double numKm) {
        double milesPerKm = 0.621371;
        return numKm * milesPerKm;
    }

    public static double convLitersToGallons(double numLiters) {
        double gallonsPerLiter = 0.264172;
        return numLiters * gallonsPerLiter;
    }

    public static double calcMpg(double distMiles, double gasGallons) {
        double milesPerGallon = distMiles / gasGallons;
        return milesPerGallon;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double distKm;
        double distMiles;
        double gasLiters;
        double gasGal;
        double userMpg;

        System.out.println("Enter kilometers driven: ");
        distKm = scnr.nextDouble();
        System.out.println("Enter liters of gas consumed: ");
        gasLiters = scnr.nextDouble();

        distMiles = convKilometersToMiles(distKm);
        gasGal = convLitersToGallons(gasLiters);
        userMpg = calcMpg(distMiles, gasGal);

        System.out.println("Miles driven: " + distMiles);
        System.out.println("Gallons of gas: " + gasGal);
        System.out.println("Mileage: " + userMpg + " mpg");
    }
}
