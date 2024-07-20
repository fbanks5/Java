package datesandtimes;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class ExampleZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York"));
//        ZonedDateTime zdt3 = ZonedDateTime.parse("2021-12-25T12:30:45+01:00[Europe/Paris]");

        for(String zoneid : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneid);
        }

        ZonedDateTime zdt3 = zdt1.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println(zdt3);
    }

}
