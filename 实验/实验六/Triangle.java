import java.util.Scanner;

public class Triangle {
	private double a, b, c;

	// Constructor
	    public Triangle(double a, double b, double c) {
	        setSide(a, b, c);
	    }
	
	    // Setters
	    public void setA(double a) {
	        setSide(a, this.b, this.c);
	        if (!(isValidTriangle(a, b, c))) {
	        	System.out.println("a input error");
	        }
	    }
	
	    public void setB(double b) {
	        setSide(this.a, b, this.c);
	        if (!(isValidTriangle(a, b, c))) {
	        	System.out.println("b input error");
	        }
	    }
	
	    public void setC(double c) {
	        setSide(this.a, this.b, c);
	        if (!(isValidTriangle(a, b, c))) {
	        	System.out.println("c input error");
	        }
	    }
	
	    public void setSide(double a, double b, double c) {
	        if (isValidTriangle(a, b, c)) {
	            this.a = a;
	            this.b = b;
	            this.c = c;
	          
	        }
	        
	    }
	
	    // Getters
	    public double getA() {
	        return this.a;
	    }
	
	    public double getB() {
	        return this.b;
	    }
	
	    public double getC() {
	        return this.c;
	    }
	
	    // Method to check if sides form a valid triangle
	    private boolean isValidTriangle(double a, double b, double c) {
	        return a + b > c && a + c > b && b + c > a;
	    }
	
	    // Calculate perimeter
	    public double getPerimeter() {
	        return (isValidTriangle(a, b, c) ? a + b + c : 0.0);
	    }
	
	    // Calculate area using Heron's formula
	    public double getArea() {
	        if (!isValidTriangle(a, b, c)) {
	            return 0.0;
	        }
	        double s = getPerimeter() / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }
	
	    // Override toString method to display side lengths
	    @Override
	    public String toString() {
	        return "a=" + a + ",b=" + b + ",c=" + c;
	    }
	
	        

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		Triangle t = new Triangle(x, y, z);
		System.out.println("perimeter=" + t.getPerimeter());
		System.out.println("area=" + t.getArea());
		System.out.println(t);
		t.setSide(t.getA() + 3, t.getB() + 2, t.getC() + 1);
		System.out.println(t);
		t.setA(t.getA() + 20);
		System.out.println(t);
		t.setB(t.getB() + 20);
		System.out.println(t);
		t.setC(t.getC() + 20);
		System.out.println(t);
		in.close();
	}
}


