package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드
    public void callCatch() {
        try {
            client.call(); // client의 call 메서드에서 예외가 발생하면 이 부분으로 돌아옴
            // Exception = MyCheckedException이 가능하기 때문에 아래 에외처리 로직에서 Exception으로 예외를 잡아도 된다.
        } catch (MyCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    // 체크 예외를 밖으로 던지는 코드
    // 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
    public void catchThrow() throws  MyCheckedException {
        client.call(); // MyCheckedException이 발생하면 밖으로 던져버린다.
    }
}
