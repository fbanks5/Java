package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculating {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourFromNow = now.plusHours(1);

        System.out.println("Current time: " + now + "\n" + "One hour from now: " + oneHourFromNow);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1); // same as today.minus(Period.ofYears(1))
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(1)); // same as today.minusYears(1)

        System.out.println("Today: " + today + "\n" + "One year ago: " + oneYearAgo);
        System.out.println("Today: " + today + "\n" + "One year ago: " + oneYearAgo2);
    }
}
