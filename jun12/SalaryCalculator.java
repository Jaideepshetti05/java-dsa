import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        double bonus = salary * 0.10;

        System.out.println("Total Salary: " + (salary + bonus));
    }
}