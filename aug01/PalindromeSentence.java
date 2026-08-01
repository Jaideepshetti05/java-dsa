public class PalindromeSentence {

    public static void main(String[] args) {

        String s = "A man a plan a canal Panama";

        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(rev));

    }
}