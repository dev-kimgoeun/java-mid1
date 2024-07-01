package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int i = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("i = " + i); //localdate는 날짜정보만 있으므로 오류


    }
}
