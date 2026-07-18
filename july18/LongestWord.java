public class LongestWord {
    public static void main(String[] args) {

        String s="Java programming language is powerful";

        String[] words=s.split(" ");

        String longest="";

        for(String w:words)
            if(w.length()>longest.length())
                longest=w;

        System.out.println(longest);
    }
}