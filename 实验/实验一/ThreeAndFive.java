package Divisible;

import java.util.Scanner;

public class ThreeAndFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number:");
		int n = in.nextInt();
		if(n%3==0&&n%5==0) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}

