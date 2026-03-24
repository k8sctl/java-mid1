package lang.immutable.address;

public class ImmutableAddress {
    // 사실 final이 없어도
    // setValue() 메서드가 없기 때문에
    // value 변수의 값을 변경할 수 있는 방법이 없다. => 불변 객체
    // 그러나 final을 명시하는 것이 좀 더 명확하다.
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
