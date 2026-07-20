import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Marks of Student " + i + ": ");
            int marks = sc.nextInt();

            sum += marks;

            if (marks > highest)
                highest = marks;

            if (marks < lowest)
                lowest = marks;
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + (double) sum / n);

        sc.close();
    }
}