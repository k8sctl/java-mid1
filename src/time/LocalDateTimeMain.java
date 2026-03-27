package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜 시간 = " + nowDt);
        System.out.println("지정 날짜 시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000day = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간 + 1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간과 지정 날짜이 같은가? " + nowDt.isEqual(ofDt));

        // isEqual()은 단순히 시간적으로 같으면 true를 반환, 객체가 다르고, 타임존이 달라도 상관 없음
        // 그러나 equals()는 객체의 타입, 타임존 등 내부 데이터의 모든 구성 요소가 같아야 true를 반환한다.
        // 서울의 9시와 UTC의 0시는 시간적으로 같다.
        // 이러한 경우에 isEqual()은 true를 반환하고, equals()는 false를 반환한다.
    }
}
