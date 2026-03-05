public class CheckPalindromeNumber {
    public static boolean isPalindrome(int n){
        int rev=0,temp=n;

        while(temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }

        return rev==n;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}