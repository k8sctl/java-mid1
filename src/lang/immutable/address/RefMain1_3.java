package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); // x001
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a와 b는 다른 인스턴스를 참조하기 때문에 b의 값을 부산으로 변경해도 a에는 영향이 없다.
        // 개발자가 change(Address adress, String changeAddress) 메서드의 기능을 알지 못 하면 사이드 이펙트를 예상하기 힘들다.
        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
