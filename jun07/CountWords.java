public class CountWords {
    public static void main(String[] args) {
        String str = "Cloud Computing and DevOps";
        String[] words = str.split("\\s+");

        System.out.println("Words Count: " + words.length);
    }
}