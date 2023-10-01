public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        int year = 2023;
        if (year < 1584) {
            System.out.println(" ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        int deliveryDistance = 100;
        if (deliveryDistance < 20 && deliveryDistance >= 0) {
            System.out.println("Потребуется дней:1");
        }
        if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней:2");
        }
        if (deliveryDistance <= 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней:3");
        }
        if (deliveryDistance > 100) {
            System.out.println(" доставки нет");
        }
        char monthNumber = 12;
        switch (monthNumber) {
            case '1':
                System.out.println("принадлежит к сезону зима");
                break;
            case '2':
                System.out.println("принадлежит к сезону зима");
                break;
            case '3':
                System.out.println("принадлежит к сезону весна");
                break;
            case '4':
                System.out.println("принадлежит к сезону весна");
                break;
            case '5':
                System.out.println("принадлежит к сезону весна");
                break;
            case '6':
                System.out.println("принадлежит к сезону лето ");
                break;
            case '7':
                System.out.println("принадлежит к сезону лето");
                break;
            case '8':
                System.out.println("принадлежит к сезону лето");
                break;
            case '9':
                System.out.println("принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("принадлежит к сезону зима");
                break;
            default:
                System.out.println("Программа не выполняеться");
        }
    }
}