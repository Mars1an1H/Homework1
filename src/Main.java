public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void identification(int clientOs, int clientDeviceYear) {
        int currentYear = 2023;

        if (clientDeviceYear < currentYear) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int delivery(int distanceD) {
        int day = 1;
        if (distanceD <= 20) {
            day = 1;
        } else if (distanceD > 20 && distanceD < 60) {
            day = 2;
        } else if (distanceD >= 60 && distanceD < 100) {
            day = 3;
        } else {
            return -1;
        }
        return day;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        checkLeapYear(2000);
    }

    public static void task2() {
        identification(1, 2014);
    }

    public static void task3() {
        int distance = 21;
        int deliveryDays = delivery(distance);
        if (deliveryDays == -1) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}