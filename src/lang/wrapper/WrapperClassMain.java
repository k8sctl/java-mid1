package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        // 박싱(Boxing)
        Integer newInteger = new Integer(10);  // 삭제 예정, 대신 valueOf() 사용 권고
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용(캐싱), 불변
        Integer integerObj2 = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // 언박싱(Unboxing)
        System.out.println("[내부 값 읽기]");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("[비교]");
        System.out.println("== : " + (newInteger == integerObj)); // 참조값 비교
        System.out.println("equals : " + (newInteger.equals(integerObj)));

        // valueOf() 캐싱 증명 - 아래 코드가 true를 반환하는 것을 확인할 수 있다.
        // 이는 두 변수가 내부적으로 이미 캐싱한 값(객체)을 동일하게 참조하고 있기 때문이다.
        System.out.println("== : " + (integerObj == integerObj2));
    }
}