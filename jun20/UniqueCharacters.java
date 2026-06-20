import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray())
            set.add(c);

        System.out.println("Unique Count: " + set.size());
    }
}