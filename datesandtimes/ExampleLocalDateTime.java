package datesandtimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime is a date and time class that does not have
        // a time zone associated with it.
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2021, 12, 25, 12, 30, 45);
        LocalDateTime ldt3 = LocalDateTime.parse("2021-12-25T12:30:45");

        System.out.println("Current date and time: " + ldt1 + "\n" + "Specific date and time: "
                + ldt2 + "\n" + "Parsed date and time: " + ldt3);

        LocalDateTime ldt4 = ldt1.minusWeeks(2);
        System.out.println("Two weeks earlier: " + ldt4);


    }
}
