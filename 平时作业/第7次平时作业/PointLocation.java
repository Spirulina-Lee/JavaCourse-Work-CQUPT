package homework;

import java.util.Scanner;

class MyPoint {
    private float x;
    private float y;

    public MyPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void printPoint() {
        System.out.println("Your location of horizontal (X) is :" + x);
        System.out.println("Your location of ordinate (Y) is :" + y);
    }
}

public class PointLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the horizontal (X) :");
        float x = scanner.nextFloat();

        System.out.println("Please input the ordinate (Y) :");
        float y = scanner.nextFloat();

        MyPoint point = new MyPoint(x, y);
        point.printPoint();

        scanner.close();
    }
}
