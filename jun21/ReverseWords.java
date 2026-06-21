public class ReverseWords {
    public static void main(String[] args) {
        String s = "Cloud DevOps Engineer";
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
}