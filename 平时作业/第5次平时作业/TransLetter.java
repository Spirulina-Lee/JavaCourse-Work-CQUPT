
package homework;

import java.util.Scanner;

public class TransLetter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = str.toUpperCase();
		System.out.println("result:" + result);
	}
}
