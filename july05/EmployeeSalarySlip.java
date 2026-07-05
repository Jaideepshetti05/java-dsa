class Employee{

    String name;
    double basic;

    Employee(String n,double b){
        name=n;
        basic=b;
    }

    void salary(){

        double hra=basic*0.2;
        double da=basic*0.1;

        System.out.println("Gross = "+(basic+hra+da));
    }
}

public class EmployeeSalarySlip{

    public static void main(String[] args){

        Employee e=new Employee("John",40000);

        e.salary();
    }
}