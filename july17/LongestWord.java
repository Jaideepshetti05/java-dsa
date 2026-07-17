public class LongestWord {
    public static void main(String[] args) {
        String s="Java programming language";

        String ans="";
        for(String word:s.split(" "))
            if(word.length()>ans.length())
                ans=word;

        System.out.println(ans);
    }
}