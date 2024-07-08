package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students?");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 
        
        ArrayList<String> students = new ArrayList<>();
        if(numberOfStudents>0) {
        	System.out.println("Please input the names of students:");
            for (int i = 0; i < numberOfStudents; i++) {
                students.add(scanner.nextLine());
            }

            System.out.println("All the students bellow:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ":" + students.get(i));
            }	
        }else
        	 System.out.println("All the students bellow:");
        

        scanner.close();
    }
}
