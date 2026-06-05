public class CountWords {
    public static void main(String[] args) {
        String sentence = "Learning Java every day";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Words = " + words.length);
    }
}