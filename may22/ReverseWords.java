// File: ReverseWords.java
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for(String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}