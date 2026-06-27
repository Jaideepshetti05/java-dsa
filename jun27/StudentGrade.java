import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int marks=sc.nextInt();

        if(marks>=90)
            System.out.println("A");
        else if(marks>=80)
            System.out.println("B");
        else if(marks>=70)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}