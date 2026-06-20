public class EmployeeSalarySlip {
    public static void main(String[] args) {
        double basic = 30000;
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        System.out.println("Gross Salary: " + gross);
    }
}