public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > maxLen) {
                    start = i;
                    maxLen = sub.length();
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    private static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}