public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        double basic = 30000;
        double hra = basic * 0.20;
        double da = basic * 0.10;

        double total = basic + hra + da;

        System.out.println("Salary = " + total);
    }
}