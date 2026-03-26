import java.util.*;

public class LongestPalindromeLength {
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                length += 2;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? length : length + 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}