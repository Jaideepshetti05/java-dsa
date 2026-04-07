public class CountVowels {
    public static int count(String str) {
        int c = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count("Hello World"));
    }
}