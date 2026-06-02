package jun02;

public class PalindromeCheck {
    // 1. Two-pointer method to check palindrome (ignores case and spaces/punctuation)
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Find next alphanumeric character from the left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Find next alphanumeric character from the right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare character values case-insensitively
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "A man, a plan, a canal: Panama",
            "race a car",
            "Was it a car or a cat I saw?",
            "hello",
            "No 'x' in Nixon"
        };

        for (String test : testStrings) {
            System.out.println("\"" + test + "\" is palindrome? " + isPalindrome(test));
        }
    }
}
