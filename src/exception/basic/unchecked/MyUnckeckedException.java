package exception.basic.unchecked;

// RuntimeException을 상속받은 예외는 언체크 예외가 된다.
public class MyUnckeckedException extends RuntimeException {

    MyUnckeckedException(String message) {
        super(message);
    }
}
