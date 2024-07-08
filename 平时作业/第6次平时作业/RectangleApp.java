package homework;

import java.util.Scanner;

class Rectangle {
    double length;
    double width;

   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    public double calculateArea() {
        return length * width;
    }

  
    public void displayInfo() {
        System.out.println("The lengh is:" + length);
        System.out.println("The width is:" + width);
        System.out.println("The area is:" + calculateArea());
    }
}

public class RectangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input length:");
        double length = scanner.nextDouble();

        System.out.println("Please input width:");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.displayInfo();

        scanner.close();
    }
}

