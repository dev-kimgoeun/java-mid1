package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        //포매팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2030, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime= now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 : " + formattedDateTime);
        System.out.println(now);

        //파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2031-01-01 11:30:00";
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 : " + parse);
    }
}
