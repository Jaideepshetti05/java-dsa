class Employee{
    String name;
    double salary;

    Employee(String n,double s){
        name=n;
        salary=s;
    }

    void display(){
        System.out.println(name+" "+salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee("John",50000);
        e.display();
    }
}