package homework;

import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;
    private double bonus;

    public Employee(String name, int age, double salary, double bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return salary + bonus;
    }

    public void display() {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's income: " + getIncome());
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the employee's name:");
        String name = in.nextLine();

        System.out.println("Please input the employee's age:");
        int age = Integer.parseInt(in.nextLine());

        System.out.println("Please input the employee's sarary:");
        double salary = Double.parseDouble(in.nextLine());

        System.out.println("Please input the employee's bonus:");
        double bonus = Double.parseDouble(in.nextLine());

        Employee employee = new Employee(name, age, salary, bonus);
        employee.display();
    }
}


