public class PalindromeWords {
    public static void main(String[] args) {
        String[] words = {"madam","hello","level","java"};

        for(String word : words){
            String rev = new StringBuilder(word).reverse().toString();
            if(word.equals(rev))
                System.out.println(word);
        }
    }
}