public class CC76 {
    public static void main(String[] args) {
        String s = "Java Programming";
        String[] words = s.split(" ");

        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}