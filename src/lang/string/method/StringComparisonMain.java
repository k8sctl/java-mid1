package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없음 모두 소문자
        String str3 = "Hello, World";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        // compareTo()는 사전순으로 비교
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b"));
        System.out.println("'a' compareTo 'c': " + "a".compareTo("c"));

        // compareToIgnoreCase() 대소문자 구분 없이 사전순으로 비교
        // 그래서 str1과 str2를 비교하면 0으로 나온다.
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}
