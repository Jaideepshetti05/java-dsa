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

        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(s);
            if (!isPrime(num)) {
                ok = false;
                break;
            }
            s = s.substring(1) + s.charAt(0);
        }

        System.out.println(ok ? "Circular Prime" : "Not Circular Prime");
    }
}