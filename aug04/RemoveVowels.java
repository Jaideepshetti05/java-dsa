public class RemoveVowels {
    public static void main(String[] args) {

        String s = "Programming";

        System.out.println(s.replaceAll("[AEIOUaeiou]", ""));
    }
}