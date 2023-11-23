public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < generateRandomArray().length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minWaste = 200001;
        int maxWast = -1;
        for (final int money : arr) {
            if (money>maxWast){
                maxWast=money;
            }
        }
        for (final int minMoney:arr){
            if (minMoney<minWaste){
                minWaste=minMoney;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minWaste+" рублей. Максимальная сумма трат за день составила "+maxWast+" рублей");
    }
    public static void task3(){
        int[] arr = generateRandomArray();
        int sum=0;
        for (int q:arr){
            sum+=q;
        }
        double average =(double) sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}