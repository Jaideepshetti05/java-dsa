public class LongestWord {
    public static void main(String[] args) {

        String sentence="Java programming language";

        String longest="";

        for(String word:sentence.split(" "))
            if(word.length()>longest.length())
                longest=word;

        System.out.println(longest);
    }
}