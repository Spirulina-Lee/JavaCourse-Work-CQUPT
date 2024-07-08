package homework;

import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = in.nextInt();
        int sum = 0;
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            sum += factorial;
            i++;
        } while (i <= n);
        System.out.println("1+2!+3!+...+n!=" + sum);
    }
    
    public static String generateFactorialString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append("!");
            if (i < n) {
                sb.append("+");
            }
        }
        return sb.toString();
    }
}
