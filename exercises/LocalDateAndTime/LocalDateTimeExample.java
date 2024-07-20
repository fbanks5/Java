package exercises.LocalDateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime event = LocalDateTime.of(2023, 11, 21, 18, 00);
        System.out.println("Event date and time: " + event);
    }
}
