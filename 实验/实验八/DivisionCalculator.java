package lab;

import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please input first number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please input second number:");
            int secondNumber = scanner.nextInt();

            checkDivisor(secondNumber);
            double result = firstNumber / secondNumber;
            System.out.println("Divisor is : " + result);
        } catch (NegativeException | ZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally!");
            scanner.close();
        }
    }

    public static void checkDivisor(int secondNumber) throws NegativeException, ZeroException {
        if (secondNumber < 0) {
            throw new NegativeException("The divisor, " + secondNumber + ", could not be negative!");
        } else if (secondNumber == 0) {
            throw new ZeroException("The divisor, " + secondNumber + ",could not be zero!");
        }
    }
}
