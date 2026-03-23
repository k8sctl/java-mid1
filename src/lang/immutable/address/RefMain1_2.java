package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a와 b는 다른 인스턴스를 참조하기 때문에 b의 값을 부산으로 변경해도 a에는 영향이 없다.
        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
