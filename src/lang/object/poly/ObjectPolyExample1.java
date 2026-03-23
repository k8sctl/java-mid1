package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    // Object는 모든 객체의 부모이기 때문에 어떤 객체든지 인자로 전달할 수 있다.
    private static void action(Object obj) {
        // Object 다형성의 한계
        // obj.sound(); // 컴파일 오류, Object는 sound()가 없다.
        // obj.move();  // 컴파일 오류, Object는 move()가 없다.

        // 객체에 맞는 다운캐스팅이 필요, 아래 2가지 방법 참고
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car) {
            ((Car) obj).move();
        }
    }
}
