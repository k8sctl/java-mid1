package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // LocalDate는 날짜 정보만 가지고 있고, 분에 대한 정보는 없다.
        // 따라서 분에 대한 정보를 조회하려고 하면 예외가 발생한다.
        // 때문에 isSupported() 메서드를 이용해서 미리 지원 여부를 확인하면 좋다.
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }
    }
}
