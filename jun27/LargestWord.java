public class LargestWord {

    public static void main(String[] args){

        String s="Learning Java Programming Language";

        String largest="";

        for(String word:s.split(" ")){
            if(word.length()>largest.length())
                largest=word;
        }

        System.out.println(largest);
    }
}