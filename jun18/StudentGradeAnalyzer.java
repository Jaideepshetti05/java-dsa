import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks >= 90)
            System.out.println("A");
        else if(marks >= 75)
            System.out.println("B");
        else
            System.out.println("C");
    }
}