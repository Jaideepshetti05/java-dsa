class Student {

    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void grade() {

        if (marks >= 90)
            System.out.println("A");
        else if (marks >= 75)
            System.out.println("B");
        else if (marks >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}

public class StudentGradeSystem {

    public static void main(String[] args) {

        Student s = new Student("Rahul", 82);

        s.grade();
    }
}