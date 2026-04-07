public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int rev = 0, temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return temp == rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}