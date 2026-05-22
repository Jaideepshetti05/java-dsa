// File: WordCount.java
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Word Count: " + words.length);
    }
}