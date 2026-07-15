import java.util.*;

class Employee{
    String name;
    int salary;

    Employee(String n,int s){
        name=n;
        salary=s;
    }
}

public class SortEmployeesBySalary{
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();

        list.add(new Employee("John",50000));
        list.add(new Employee("Alex",35000));
        list.add(new Employee("Sam",70000));

        list.sort((a,b)->a.salary-b.salary);

        for(Employee e:list)
            System.out.println(e.name+" "+e.salary);
    }
}