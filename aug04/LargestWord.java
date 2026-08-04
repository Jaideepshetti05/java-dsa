public class LargestWord {
    public static void main(String[] args) {
        String str = "Java programming is awesome";

        String[] words = str.split(" ");

        String longest = "";

        for (String w : words)
            if (w.length() > longest.length())
                longest = w;

        System.out.println(longest);
    }
}