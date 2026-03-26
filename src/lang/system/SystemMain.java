package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. - 운영체제
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. - 자바
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        // 원래는 복사하려면 반복문을 이용해서 복사해야 한다.
        // System.arraycopy()를 이용하면 하드웨어 레벨에서 통으로 복사해버린다. 최소 2배 이상 빠름
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);       // 프로그램을 종료하기 전에 정리를 하고 끝내야 하기 때문에, 일반적으로 권장 X
        System.out.println("hello"); // 프로그램을 종료했기 때문에 해당 부분은 출력되지 않는다.
    }
}
