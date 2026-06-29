import java.util.Scanner;

class Employee {

    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateBonus() {
        return basicSalary * 0.10;
    }

    double calculateTax() {
        return basicSalary * 0.05;
    }

    double netSalary() {
        return basicSalary + calculateBonus() - calculateTax();
    }

    void display() {
        System.out.println("\nEmployee: " + name);
        System.out.println("Basic Salary : ₹" + basicSalary);
        System.out.println("Bonus : ₹" + calculateBonus());
        System.out.println("Tax : ₹" + calculateTax());
        System.out.println("Net Salary : ₹" + netSalary());
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Basic Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, salary);

        emp.display();

        sc.close();
    }
}