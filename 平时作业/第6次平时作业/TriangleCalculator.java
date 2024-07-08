package homework;

import java.util.Scanner;

class Triangle {
    double a;
	double b;
	double c;

    public Triangle(double a, double b, double c) {
        if (isValidTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public void setSide(double x, double y, double z) {
        if (isValidTriangle(x, y, z)) {
            this.a = x;
            this.b = y;
            this.c = z;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    private boolean isValidTriangle(double x, double y, double z) {
        return x + y > z && x + z > y && y + z > x;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        Triangle triangle = new Triangle(a, b, c);
        System.out.printf("perimeter=%.1f\n", triangle.getPerimeter());
        System.out.printf("area=%.1f\n", triangle.getArea());
        System.out.printf("a=%.1f,b=%.1f,c=%.1f\n", triangle.a, triangle.b, triangle.c);
    }
}
