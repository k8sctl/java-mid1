package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        Discountservice discountservice = new Discountservice();

        int basic = discountservice.discount("BASIC", price);
        int gold = discountservice.discount("GOLD", price);
        int diamond = discountservice.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}