package homework;

import java.util.Arrays;

import java.util.Scanner;

public class SortIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Please input 10 numbers:");
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);
		for(int number : numbers) {
			System.out.print(number + ",");
		}
		scanner.close();
	}

}

