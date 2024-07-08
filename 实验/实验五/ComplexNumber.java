package lab;

import java.util.Scanner;


public class ComplexNumber {
 private double realPart;   
 private double imaginaryPart; 


 public ComplexNumber(double real, double imaginary) {
     this.realPart = real;
     this.imaginaryPart = imaginary;
 }


 public ComplexNumber add(ComplexNumber other) {
     return new ComplexNumber(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart);
 }


 public ComplexNumber subtract(ComplexNumber other) {
     return new ComplexNumber(this.realPart - other.realPart, this.imaginaryPart - other.imaginaryPart);
 }


 public ComplexNumber multiply(ComplexNumber other) {
     double newReal = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
     double newImaginary = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
     return new ComplexNumber(newReal, newImaginary);
 }


 public ComplexNumber divide(ComplexNumber other) {
     ComplexNumber conjugate = new ComplexNumber(other.realPart, -other.imaginaryPart);
     ComplexNumber numerator = this.multiply(conjugate);
     double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
     return new ComplexNumber(numerator.realPart / denominator, numerator.imaginaryPart / denominator);
 }



 public String toString() {
     return this.realPart + " + " + this.imaginaryPart + "i";
 }


 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("input c1:");
     double real1 = scanner.nextDouble();
     double imag1 = scanner.nextDouble();
     ComplexNumber c1 = new ComplexNumber(real1, imag1);

     System.out.println("input c2:");
     double real2 = scanner.nextDouble();
     double imag2 = scanner.nextDouble();
     ComplexNumber c2 = new ComplexNumber(real2, imag2);
    
     System.out.println("ComplexNumber a: " + c1);
     System.out.println("ComplexNumber b: " + c2);
     System.out.println("(a + b) = " + c1.add(c2));
     System.out.println("(a - b) = " + c1.subtract(c2));
     System.out.println("(a * b) = " + c1.multiply(c2));


     scanner.close();
 }
}
