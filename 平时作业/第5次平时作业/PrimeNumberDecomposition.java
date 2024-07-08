package homework;

import java.util.Scanner;

public class PrimeNumberDecomposition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n % 2 == 0 && n > 6) {
			
			if (isPrime(n - 1)) {
				System.out.println(n + "=1+" + (n - 1));
			}
			for (int i = 2; i <= n / 2; i++) {
				if (isPrime(i) && isPrime(n - i)) {
					System.out.println(n + "=" + i + "+" + (n - i));
				}
			}
		} else {
			
		}
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
