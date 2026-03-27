package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    public static void main(String[] args) {
        // 내 코드
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + dateTime);
        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);
        dateTime = dateTime.plus(period).plus(duration);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + dateTime);

        // 풀이
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime futureDateTime =
                dateTime2.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각: " + dateTime2);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + futureDateTime);
    }
}
