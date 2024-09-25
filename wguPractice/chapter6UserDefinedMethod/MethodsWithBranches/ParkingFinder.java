package wguPractice.chapter6UserDefinedMethod.MethodsWithBranches;

import java.util.Scanner;

public class ParkingFinder {
    public static int findParkingPrice(int numParkingVisits, int numParkingDuration) {
        int dailyParkingPrice;

        if (numParkingVisits <= 9) {
            if (numParkingDuration <= 7) {
                dailyParkingPrice = 24;
            }
            else if (numParkingDuration >= 8 && numParkingDuration <= 27) {
                dailyParkingPrice = 23;
            }
            else {
                dailyParkingPrice = 22;
            }

        }
        else if (numParkingVisits >= 10 && numParkingVisits <= 17) {
            if (numParkingDuration <= 7) {
                dailyParkingPrice = 16;
            }
            else if (numParkingDuration >= 8 && numParkingDuration <= 27) {
                dailyParkingPrice = 14;
            }
            else {
                dailyParkingPrice = 11;
            }
        }
        else {
            if (numParkingDuration <= 7) {
                dailyParkingPrice = 9;
            }
            else if (numParkingDuration >= 8 && numParkingDuration <= 27) {
                dailyParkingPrice = 4;
            }
            else {
                dailyParkingPrice = 3;
            }
        }

        return dailyParkingPrice;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numVisits;
        int duration;

        numVisits = scnr.nextInt();
        duration = scnr.nextInt();

        System.out.println(findParkingPrice(numVisits, duration));
    }
}
