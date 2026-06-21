public class SalaryCalculator {
    public static void main(String[] args) {
        double basic = 50000;
        double hra = basic * 0.2;
        double da = basic * 0.1;

        System.out.println("Net Salary: " + (basic + hra + da));
    }
}