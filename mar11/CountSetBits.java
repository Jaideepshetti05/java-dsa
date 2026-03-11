public class CountSetBits {
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(countBits(n));
    }
}