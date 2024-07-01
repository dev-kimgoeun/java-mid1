package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startdate = LocalDate.of(2024, 1, 1);
        LocalDate enddate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startdate,enddate);
        long daysBetween = ChronoUnit.DAYS.between(startdate,enddate);

        System.out.println("시작 날짜 : " + startdate);
        System.out.println("목표 날짜 : " + enddate);
        System.out.println("남은 기간 : " + period.getYears()+"년, " + period.getMonths() + "월, " + period.getDays() + "일");
        System.out.println("디데이 : " + daysBetween +"일" );
    }
}
