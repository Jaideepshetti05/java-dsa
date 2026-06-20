import java.util.*;

public class CircularPrime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 197;
        String s = String.valueOf(n);

        boolean circular = true;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (!isPrime(Integer.parseInt(rotated))) {
                circular = false;
                break;
            }
        }
        System.out.println(circular ? "Circular Prime" : "Not Circular Prime");
    }
}