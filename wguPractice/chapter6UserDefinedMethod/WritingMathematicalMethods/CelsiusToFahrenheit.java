package wguPractice.chapter6UserDefinedMethod.WritingMathematicalMethods;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double celsiusTemp) {
        double fahrenheitTemp;
        fahrenheitTemp = celsiusTemp * 9.0 / 5.0 + 32.0;
        return fahrenheitTemp;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double tempF;
        double tempC;

        System.out.println("Enter temperature in Celsius: ");
        tempC = scnr.nextDouble();

        tempF = celsiusToFahrenheit(tempC); //FIXME: Call celsiusToFahrenheit() to convert tempC to Fahrenheit and store the result in tempF

        System.out.print("Fahrenheit: ");
        System.out.println(tempF);
    }

}
