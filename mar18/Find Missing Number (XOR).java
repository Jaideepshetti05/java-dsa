public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        int xor1 = 0, xor2 = 0;

        for (int i = 1; i <= n; i++) xor1 ^= i;
        for (int num : arr) xor2 ^= num;

        System.out.println("Missing: " + (xor1 ^ xor2));
    }
}