public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
        double[] att = {1.57, 7.654, 9.986};
        for (int t = 0; t < att.length; t++) {
            System.out.print(att[t] + ",");
        }
        System.out.println(" ");
        int[] aww = {2, 54, 304, 1000, 2000};
        for (int w = 0; w < aww.length; w++) {
            System.out.print(aww[w] + ",");
        }
        System.out.println(" ");
        for (int q = 2; q >= 0; q--) {
            System.out.print(arr[q] + ",");
        }
        System.out.println(" ");
        for (double e = 2; e >= 0; e--) {
            System.out.print(att[(int) e] + ",");
        }
        System.out.println(" ");
        for (int y = aww.length - 1; y >= 0; y--) {
            System.out.print(aww[y] + ",");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + ",");
        }
    }
}