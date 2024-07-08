package homework;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// 1.Input num
		Scanner scanner = new Scanner(System.in);
		int num;
		do {
			num = scanner.nextInt();
			if (num == 0) {
				System.out.println("programe is over.");
				break;
			}
			isPrimeNum(num);
		} while (true);
	}

	private static void isPrimeNum(int num) {
		boolean flag = true;
		// prime num can`t divide by any num except 1 and itself
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(num + " is sushu.");
		} else {
			System.out.println(num + " is not sushu.");
		}
	}
}

