package exercises.LocalDateAndTime;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime overseasEvent = ZonedDateTime.of(2023, 11, 21, 18, 00,
                00, 00, ZoneId.of("Asia/Tokyo"));
        System.out.println("Local event date and time: " + overseasEvent);

        LocalTime startTime = LocalTime.of(9, 00);
        LocalTime endTime = LocalTime.of(17, 00);
        System.out.println("Event duration: " + Duration.between(startTime, endTime));

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        System.out.println("Event period: " + Period.between(startDate, endDate));

    }
}
