import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");
        System.out.println("Words = " + words.length);
    }
}