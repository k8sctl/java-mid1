package enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;
        Discountservice discountservice = new Discountservice();
        int basic = discountservice.discount(ClassGrade.BASIC, price);
        int gold = discountservice.discount(ClassGrade.GOLD, price);
        int diamond = discountservice.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
