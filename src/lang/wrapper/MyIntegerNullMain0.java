package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));  // -1을 반환
        System.out.println(findValue(intArr, 0));   // 0을 반환
        System.out.println(findValue(intArr, 1));   // 1을 반환
        System.out.println(findValue(intArr, 100)); // 100을 못 찾고 -1을 반환
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1; // target을 못 찾았을 경우 -1을 반환
    }
}
