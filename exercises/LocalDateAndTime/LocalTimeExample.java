package exercises.LocalDateAndTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime meeting = LocalTime.of(13, 30);
        System.out.print("Meeting time: " + meeting);
    }
}
