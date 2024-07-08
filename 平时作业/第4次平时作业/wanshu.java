package homework;

import java.util.Scanner;

public class wanshu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        findPerfectNumbers(m, n);
    }

    public static void findPerfectNumbers(int m, int n) {
        System.out.println(m + " to " + n + " WanShu:");
        for (int i = m; i <= n; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
