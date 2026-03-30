package nested.anonymous.ex;

public class Ex0_1Main {

    public static void helloPrint(String value) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + value);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloPrint("Java");
        helloPrint("Spring");
    }
}
