public class LongestWord {
    public static void main(String[] args) {
        String text = "Java programming language";

        String[] words = text.split(" ");

        String longest = "";

        for(String w:words)
            if(w.length()>longest.length())
                longest=w;

        System.out.println(longest);
    }
}