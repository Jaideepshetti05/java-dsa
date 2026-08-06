import java.util.*;

public class PalindromeWords {
    public static void main(String[] args) {
        String sentence = "madam hello level java civic";
        String[] words = sentence.split(" ");

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equals(rev))
                System.out.println(word);
        }
    }
}