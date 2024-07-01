package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {

        ZonedDateTime SeoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime LondonDateTime = SeoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime NewyorkDateTime = SeoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("SeoulTime = " + SeoulTime);
        System.out.println("LondonDateTime = " + LondonDateTime);
        System.out.println("NewyorkDateTime = " + NewyorkDateTime);
    }
}
