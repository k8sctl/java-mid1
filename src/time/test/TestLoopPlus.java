package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {

        // 내 코드
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("날짜 " + (i+1) + ": " + localDate);
            localDate = localDate.plusWeeks(2);
        }

        System.out.println();
        // 풀이
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5 ; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + ": " + nextDate);
        }
    }
}
