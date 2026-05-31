public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello Java World";
        String[] words = str.split(" ");

        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }
}