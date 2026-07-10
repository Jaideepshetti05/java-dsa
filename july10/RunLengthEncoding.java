import java.util.*;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String s = "aaabbccccdd";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1))
                count++;
            else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println(result);
    }
}