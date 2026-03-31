package exception.basic.unchecked;

public class Client {

    // 언체크 예외는 throws를 명시하지 않아도 된다.
    // 예외가 발생하면 자동으로 던진다.
    public void call() {
        throw new MyUnckeckedException("ex");
    }
}
