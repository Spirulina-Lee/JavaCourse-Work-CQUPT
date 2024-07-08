package homework;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		int letters = 0,spaces=0,numbers=0,others=0;
		String input = scanner.nextLine();
		for(char c : input.toCharArray())
			if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isDigit(c)) {
				numbers++;
			}else if(Character.isSpaceChar(c)) {
				spaces++;
			}else {
				others++;
			}
		System.out.println("The number of numbers is: "+numbers);
		System.out.println("The number of English letters is: "+letters);
		System.out.println("The number of blank space is: "+spaces);
		System.out.println("The number of other characters is: "+others);
		

	}

}

