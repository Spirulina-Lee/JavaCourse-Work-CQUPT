package lab;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your score");
        try {
            int score = scanner.nextInt();
            checkScore(score);
            System.out.println("Your score is:" + score);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkScore(int score) throws MyException {
        if (score < 0 || score > 100) {
            throw new MyException("Error,score should be in 0-100.");
        }
    }
}
