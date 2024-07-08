package alpha;

import java.util.Scanner;

public class alphaCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		scanner.close();
		int[] charCount = new int[26];
		for(int i = 0;i < input.length();i++)
		{
			char c =input.charAt(i);
			if(Character.isLetter(c))
			{
				int index = c - 'a';
				charCount[index]++;
			}
		}
		for(char c = 'a';c<='z';c++)
		{
			int index = c - 'a';
			if(charCount[index]>0)
			{
				System.out.println("(" + Character.toUpperCase(c) +")Num=" + charCount[index]);
			}
		}

	}

}



