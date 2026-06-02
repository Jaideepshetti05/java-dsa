package jun02;

import java.util.Arrays;

public class PrimeCheck {
    // 1. Trial division method: O(sqrt(N)) time complexity
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // 2. Sieve of Eratosthenes: O(N log log N) time complexity
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                // Update all multiples of p greater than or equal to the square of it
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int val = 29;
        System.out.println("Checking prime status for " + val + ": " + isPrime(val));

        int val2 = 35;
        System.out.println("Checking prime status for " + val2 + ": " + isPrime(val2));

        int limit = 50;
        System.out.println("Primes up to " + limit + " using Sieve of Eratosthenes:");
        boolean[] primes = sieveOfEratosthenes(limit);
        for (int i = 0; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
