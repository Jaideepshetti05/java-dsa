class Employee{

    double basic;

    Employee(double b){
        basic=b;
    }

    void salary(){
        double hra=basic*0.2;
        double da=basic*0.1;
        System.out.println("Net Salary = "+(basic+hra+da));
    }
}

public class EmployeeSalaryCalculator{

    public static void main(String[] args){

        Employee e=new Employee(40000);

        e.salary();

    }
}