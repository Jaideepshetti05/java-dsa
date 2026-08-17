import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                return;
            }
        }

        System.out.println("No unique character");
    }
}