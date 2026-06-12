import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthYear = sc.nextInt();

        int age = LocalDate.now().getYear() - birthYear;

        System.out.println("Age: " + age);
    }
}