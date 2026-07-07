import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray())
            set.add(c);

        System.out.println("Unique Characters: " + set);
    }
}