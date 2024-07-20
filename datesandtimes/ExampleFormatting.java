package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;


public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        // format date with custom pattern
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/d/yyyy");
        System.out.println("Formatted date: " + dtf.format(now));
        System.out.println("Formatted date: " + dtf.format(today));

        // format date with predefined pattern
        LocalDate ld = LocalDate.parse("July/15/2024", dtf);
        System.out.println("Parsed date: " + ld.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
        DateTimeFormatter dtf1 = dtfb.appendLiteral("Today is: ")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .toFormatter();

        System.out.println(ld.format(dtf1));


    }
}
