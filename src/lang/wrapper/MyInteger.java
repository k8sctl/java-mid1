package lang.wrapper;

public class MyInteger {

    public final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // return value + ""; // 문자열 + 숫자 -> 문자열
        return String.valueOf(value);
    }
}
