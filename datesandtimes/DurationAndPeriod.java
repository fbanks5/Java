package datesandtimes;

import java.time.Duration;
import java.time.Period;

public class DurationAndPeriod {
    public static void main(String[] args) {
        Duration d1 = Duration.ofNanos(1000000000);
        Duration d2 = Duration.ofSeconds(100, 1000);
        Duration d3 = Duration.ofDays(7);

        Duration d4 = d3.plus(d1);


        Period p1 = Period.of(10, 3, 2);
        Period p2 = Period.ofWeeks(12);

        System.out.println(p1.getDays());
        System.out.println(p2.getDays());
    }
}
