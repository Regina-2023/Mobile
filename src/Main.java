public class Main {
    public static void main(String[] args) {
        int start = 150; //начальный баланс
        int add = 1200; //сумма пополнения
        if (add > 1000) {
            int bonus = add / 100;
            System.out.println(bonus + " бонусных рублей");
            System.out.println(start + add + bonus + " рублей на балансе");
        } else {
            System.out.println(0 + " бонусных рублей");
            System.out.println(start + add + " рублей на балансе");
        }
    }
}