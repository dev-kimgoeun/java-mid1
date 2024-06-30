package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDateTime ofDT = LocalDateTime.of(2024, 8,2,3,5,23);
        System.out.println("현재 날짜 시간  = " +nowDT);
        System.out.println("지정 날짜 시간  = " +ofDT);

        //날짜와 시간 분리
        LocalDate localDate = ofDT.toLocalDate();
        LocalTime localTime = ofDT.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);


        //계산 불변
        LocalDateTime ofDTPlus = ofDT.plusDays(10000);
        System.out.println("지정 날짜시간 + 10000d" + ofDTPlus);
        LocalDateTime ofDTPlus1Year = ofDT.plusYears(1);
        System.out.println("지정 날짜시간 +1 년" + ofDTPlus1Year);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDT.isBefore(ofDT));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDT.isAfter(ofDT));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " + nowDT.isEqual(ofDT));
    }
}
