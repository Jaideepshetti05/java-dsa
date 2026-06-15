import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String largest = "";

        for(String w : words)
            if(w.length() > largest.length())
                largest = w;

        System.out.println(largest);
    }
}