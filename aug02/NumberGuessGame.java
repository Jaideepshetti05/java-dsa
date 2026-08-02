import java.util.*;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 7;

        System.out.print("Guess Number: ");

        int guess = sc.nextInt();

        if (guess == number)
            System.out.println("Correct!");
        else
            System.out.println("Wrong!");

        sc.close();
    }
}