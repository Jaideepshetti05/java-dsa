public class PalindromeSentence {
    public static void main(String[] args) {
        String s = "Madam";

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}