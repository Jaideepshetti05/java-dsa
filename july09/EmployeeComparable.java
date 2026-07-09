import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int compareTo(Employee e){
        return this.id-e.id;
    }

    public String toString(){
        return id+" "+name;
    }
}

public class EmployeeComparable{
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();

        list.add(new Employee(3,"Tom"));
        list.add(new Employee(1,"John"));
        list.add(new Employee(2,"Alice"));

        Collections.sort(list);

        System.out.println(list);
    }
}