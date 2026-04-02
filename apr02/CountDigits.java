public class CountDigits {
    public static int count(int n) {
        int c = 0;
        while (n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
}