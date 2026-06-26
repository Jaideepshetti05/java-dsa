class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        return basicSalary + hra + da;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 50000);
        System.out.println("Employee: " + emp.name);
        System.out.println("Net Salary: ₹" + emp.calculateSalary());
    }
}