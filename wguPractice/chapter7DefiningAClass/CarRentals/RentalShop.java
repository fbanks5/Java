package wguPractice.chapter7DefiningAClass.CarRentals;

import java.util.Scanner;

public class RentalShop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int newMileage;
        String newRenter;
        char newWeekendPrice;
        RentalCar rentalCar1 = new RentalCar();

        System.out.println("Default values: ");
        rentalCar1.print();

        newMileage = scnr.nextInt();
        newRenter = scnr.next();
        newWeekendPrice = scnr.next().charAt(0);

        rentalCar1.setMileage(newMileage);
        rentalCar1.setRenter(newRenter);
        rentalCar1.setWeekendPrice(newWeekendPrice);

        System.out.println("After mutator methods: ");
        rentalCar1.print();
    }
}
