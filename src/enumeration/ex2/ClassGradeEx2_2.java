package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        Discountservice discountservice = new Discountservice();
        // ClassGrade newClassGrade = new ClassGrade(); // private 생성자를 이용하면 클래스 외부에서 객체를 생성하는 것을 막을 수 있다.
        // int result = discountservice.discount(newClassGrade, price);
        // System.out.println("newClassGrade 등급의 할인 금액: " + result);
    }
}
