package exercises.LocalDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        // Formatting date and time
        LocalDateTime ld1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = ld1.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Parse a date string into a LocalDate object
        String dateStr = "2023-11-21";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateStr, dateFormatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}
