class Student{
    String name;
    int marks;

    Student(String n,int m){
        name=n;
        marks=m;
    }

    void display(){
        System.out.println(name+" Grade: "+(marks>=40?"Pass":"Fail"));
    }
}

public class StudentGradeManager{
    public static void main(String[] args){
        Student s=new Student("Rahul",78);
        s.display();
    }
}