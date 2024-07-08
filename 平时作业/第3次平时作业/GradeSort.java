package ScoreGrade;

import java.util.Scanner;

public class GradeSort {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please input a score:");
        
        int score = in.nextInt();
        
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        System.out.println(grade);

	}

}

