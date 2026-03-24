package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // add()는 ImmutableObj 타입의 인스턴스를 반환하는데
        // add() 메서드의 리턴 값을 받사서 사용하지 않는다.
        // 따라서 참조되지 않은 인스턴스는 GC에 의해 삭제되고 사용자는 아무 처리도 이루어지지 않은 것처럼 보인다.

        // 계산 이후에도 기존 값과 신규 값 모두 확인이 가능하다.
        System.out.println("obj1 = " + obj1.getValue());
    }
}
