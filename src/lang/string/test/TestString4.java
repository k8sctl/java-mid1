package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        // substring()을 사용해서, hello 부분과 .txt 부분을 분리해라.
        // 단순하게 substring()에 숫자를 직접 입력해서 풀면 된다.
        String str = "hello.txt";
        String filename = str.substring(0, 5);
        String extName = str.substring(5,9);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
