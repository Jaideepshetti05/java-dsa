public class LongestWord{
    public static void main(String[] args){

        String text="Java is an amazing programming language";

        String longest="";

        for(String word:text.split(" "))
            if(word.length()>longest.length())
                longest=word;

        System.out.println(longest);
    }
}