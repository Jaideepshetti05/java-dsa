import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;

        int guess;

        do {
            System.out.print("Guess: ");
            guess = sc.nextInt();

            if(guess < number)
                System.out.println("Too Low");
            else if(guess > number)
                System.out.println("Too High");

        } while(guess != number);

        System.out.println("Correct!");
    }
}