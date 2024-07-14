package datesandtimes;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(12, 30, 45);
        LocalTime lt3 = LocalTime.parse("12:30:45");

        System.out.println("Current time: " + lt1 + "\n" + "Specific time: " + lt2 + "\n" + "Parsed time: " + lt3);

        LocalTime lt4 = lt1.plusHours(2);
        System.out.println("Two hours later: " + lt4);
    }
}
