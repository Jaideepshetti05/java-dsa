public class CountWords {
    public static void main(String[] args) {
        String str="Cloud and DevOps Engineering";
        String[] words=str.split("\\s+");
        System.out.println("Words: "+words.length);
    }
}