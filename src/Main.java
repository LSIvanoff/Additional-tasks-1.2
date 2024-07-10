public class Main {
    public static void main(String[] args) {
        System.out.println("Additional tasks 1.2");
        System.out.println("Task 1");
        int a = 47;
        int b = 13;
        int c = a / b;
        int d = a % b;
        System.out.println("47/13 равно " + c + " и " + d + " в остатке.");

        System.out.println("Task 2");
        int a1 = 44;
        int an = a1 / 10;
        int aw = a1 % 10;
        System.out.println("Сумма цифр числа " + a1 + " равна " + (an + aw));

        System.out.println("Task 3");
        int a2 = 345;
//        int af2 = a2 / 100;
//        int an2 = (a2 % 100) / 10;
//        int aw2 = (a2 % 100) % 10;
        int af2 = a2 % 10;
        int an2 = a2 / 10 % 10;
        int aw2 = a2 / 100;
        System.out.println(af2);
        System.out.println(an2);
        System.out.println(aw2);
        System.out.println("Сумма цифр числа " + a2 + " равна " + (af2 + an2 + aw2));

        System.out.println("Task 4");
        int bouquet = 4899;
        int card = 157;
        float discount = 0.9f;
        float bouquetDiscount = bouquet * discount;
        float cardDiscount = card * discount;
        float discountSum = (bouquet - bouquetDiscount) + (card - cardDiscount);
        System.out.println("Сумма двух покупок с учетом скидки равна " + (bouquetDiscount + cardDiscount) + " рублей");
        System.out.println("Сумма скидки двух покупок составляет " + discountSum + " рублей");

    }
}