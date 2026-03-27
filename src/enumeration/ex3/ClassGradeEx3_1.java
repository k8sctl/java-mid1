package enumeration.ex3;

public class ClassGradeEx3_1 {

    public static void main(String[] args) {
        int price = 10000;
        Discountservice discountservice = new Discountservice();
        int basic = discountservice.discount(Grade.BASIC, price);
        int gold = discountservice.discount(Grade.GOLD, price);
        int diamond = discountservice.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
