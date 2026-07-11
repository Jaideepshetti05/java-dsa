import java.util.*;

class Student{
    String name;
    int marks;

    Student(String n,int m){
        name=n;
        marks=m;
    }
}

public class StudentGradeManager{
    public static void main(String[] args){

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("Alice",90));
        list.add(new Student("Bob",78));

        for(Student s:list){
            System.out.println(s.name+" "+s.marks);
        }
    }
}