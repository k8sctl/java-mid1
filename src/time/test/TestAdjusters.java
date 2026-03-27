package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);

        // 테스트
        LocalDate date2 = LocalDate.of(year, month, 2);
        DayOfWeek firstDayOfWeek2 = date2.withDayOfMonth(1).getDayOfWeek();
        System.out.println("firstDayOfWeek2 = " + firstDayOfWeek2);

        LocalDate date3 = LocalDate.of(year, month, 2);
        DayOfWeek firstDayOfWeek3 = date3.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek3 = " + firstDayOfWeek3);
    }
}
