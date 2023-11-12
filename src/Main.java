public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
        for (int o = 10; o > 0; o = o - 1) {
            System.out.println(o);
        }
        for (int p = 0; p < 17; p = p + 2) {
            System.out.println(p);
        }
        for (int q = -10; q <= 10; q = q + 1) {
            System.out.println(q);
        }
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + "год является високосным");
        }
        for (int seven = 7; seven <= 98; seven = seven + 7) {
            System.out.println(seven);
        }
        for (int two = 1; two <= 512; two = two * 2) {
            System.out.println(two);
        }
        int money = 29000;
        int total = 0;
        for (int w = 0; w < 12; w++) {
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц" + w + ", сумма накоплений равна " + total + "рублей");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}