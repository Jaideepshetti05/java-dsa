public class PalindromeSentence {
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}