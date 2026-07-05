import java.util.*;

class Student{

    String name;
    int marks;

    Student(String n,int m){
        name=n;
        marks=m;
    }
}

public class StudentGradeBook{

    public static void main(String[] args){

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("A",91));
        list.add(new Student("B",76));

        for(Student s:list){

            System.out.println(s.name+" "+s.marks);
        }
    }
}