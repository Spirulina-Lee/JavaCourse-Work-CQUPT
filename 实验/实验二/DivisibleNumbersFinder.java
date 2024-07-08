package homework;

import java.util.Scanner;

public class DivisibleNumbersFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input one:");
		int num1 = scanner.nextInt();
		System.out.println("input two:");
		int num2 = scanner.nextInt();
		scanner.close();
		if(num1>num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1;i<=num2;i++)
		{
			if(i%3 == 0 && i%5 == 0)
				System.out.println(i);	
		}

	}

}

