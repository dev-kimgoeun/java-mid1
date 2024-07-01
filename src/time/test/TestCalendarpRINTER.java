package time.test;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class TestCalendarpRINTER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.println("월을 입력하세요  :");
        int month = sc.nextInt();

        printCalendar(year,month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayofmonth = LocalDate.of(year, month, 1);
        LocalDate firstDayofNextMonth = firstDayofmonth.plusMonths(1);
        int offsetWeeekDays = firstDayofmonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa  ");
        for (int i = 0; i < offsetWeeekDays; i++) {
            System.out.print("   ");

        }
        LocalDate dayIterator = firstDayofmonth;
        while (dayIterator.isBefore(firstDayofNextMonth)){
            System.out.printf("%2d ",dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);

        }
    }
}
