public class Main {
    public static void main(String[] args) {
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + money;
            total = total + total / 100;
            i = i + 1;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }
        int one = 1;
        int ten = 10;
        while (one <= ten) {
            System.out.print(one + " ");
            one++;
        }
        System.out.println();
        for (ten = 10; ten > 0; ) {
            System.out.print(ten + " ");
            ten--;
        }
        System.out.println();
        int population = 12000000;
        int mortality = 8;
        int birthRate = 17;
        int people;
        for (int year = 1; year <= 10; year++) {
            people = population / 1000 * (birthRate - mortality);
            population = people + population;
            System.out.println("Год" + year + ", численность населения составляет " + population);
        }
        int rubles = 15000;
        int saves = 0;
        int mountsWait = 0;
        while (saves < 12000000) {
            saves = saves + rubles;
            saves = saves + saves / 100 * 7;
            mountsWait++;
            if (mountsWait % 6 == 0) {
                System.out.println(mountsWait + " " + saves);}}
            int initialDeposit = 15000;
            int years = 9;
            int mountsInYear = 12;
            int numberOfMouths = years * mountsInYear;
            int sum = 0;
            for (int time = 1; time <= numberOfMouths; time++) {
                sum = sum + initialDeposit;
                sum = sum + sum / 100 * 7;
                if (time % 6 == 0) {
                    System.out.println(time + " " + sum);}}
                for (int p = 1; p <= 31; p++)
                    if (p % 5 == 0) {
                        System.out.println("Сегодня пятница," + p + "-е число. Необходимо подготовить отчет");}
                int thisYear=2023;
                int after=100;
                int before=200;
                int afterYears=thisYear+after;
                for (int beforeYear=thisYear-before;beforeYear<=afterYears;beforeYear++){
                    if (beforeYear%79==0){
                        System.out.println(beforeYear);}
                }
            }
        }