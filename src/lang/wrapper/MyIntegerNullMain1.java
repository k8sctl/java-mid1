package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1));  // -1을 반환
        System.out.println(findValue(intArr, 0));   // 0을 반환
        System.out.println(findValue(intArr, 1));   // 1을 반환
        System.out.println(findValue(intArr, 100)); // 100을 못 찾고 -1을 반환
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger; // toString()을 객체를 출력하면 객체의 value 값이 출력되도록 만듬
            }
        }
        return null; // target을 못 찾았을 경우 null을 반환
    }
}
