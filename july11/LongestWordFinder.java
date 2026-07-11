public class LongestWordFinder {
    public static void main(String[] args) {
        String s="Java programming language is amazing";

        String longest="";

        for(String word:s.split(" ")){
            if(word.length()>longest.length())
                longest=word;
        }

        System.out.println(longest);
    }
}