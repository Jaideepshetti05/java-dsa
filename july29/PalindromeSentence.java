public class PalindromeSentence {

    public static void main(String[] args) {

        String s = "Madam";

        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s.equalsIgnoreCase(rev));
    }
}