public class LongestWord {
    public static void main(String[] args) {
        String str = "Cloud Computing and DevOps Engineering";

        String[] words = str.split(" ");
        String longest = "";

        for(String word : words){
            if(word.length() > longest.length())
                longest = word;
        }

        System.out.println(longest);
    }
}