import java.util.Scanner;

public class StudentAttendanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Total Classes: ");
            int total = sc.nextInt();

            System.out.print("Classes Attended: ");
            int attended = sc.nextInt();

            double percentage = (double) attended / total * 100;

            System.out.printf("Attendance: %.2f%%%n", percentage);

            if (percentage >= 75)
                System.out.println("Eligible");
            else
                System.out.println("Not Eligible");
        }

        sc.close();
    }
}