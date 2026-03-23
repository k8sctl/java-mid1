package lang.object;


// 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속받는다.
// extends Object는 생략 가능
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
