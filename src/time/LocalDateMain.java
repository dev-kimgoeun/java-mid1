package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2015, 12, 21);
        System.out.println("오늘 날짜는 = " + nowDate);
        System.out.println("지정 날짜는 = "+ ofDate);

        //계산 불변
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 +10d = " + ofDate);

    }
}
