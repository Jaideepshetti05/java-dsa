package jun02;

public class Fibonacci {
    // 1. Plain recursive method: O(2^N) time complexity
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // 2. Dynamic Programming method (Memoization): O(N) time complexity
    public static int fibMemoization(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
        return memo[n];
    }

    // 3. Dynamic Programming method (Tabulation): O(N) time and O(N) space
    public static int fibTabulation(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 40; // Fibonacci number to find

        // Using DP Memoization
        long startTime = System.nanoTime();
        int[] memo = new int[n + 1];
        int fibDP = fibMemoization(n, memo);
        long endTime = System.nanoTime();
        double dpTime = (endTime - startTime) / 1e6;
        System.out.println("DP Memoization Fib(" + n + ") = " + fibDP + " in " + dpTime + " ms");

        // Using Tabulation
        startTime = System.nanoTime();
        int fibTab = fibTabulation(n);
        endTime = System.nanoTime();
        double tabTime = (endTime - startTime) / 1e6;
        System.out.println("DP Tabulation Fib(" + n + ") = " + fibTab + " in " + tabTime + " ms");

        // Using plain recursion (warning: n=40 takes noticeable time, let's use n=30 for quick recursive demonstration)
        int recN = 30;
        startTime = System.nanoTime();
        int fibRec = fibRecursive(recN);
        endTime = System.nanoTime();
        double recTime = (endTime - startTime) / 1e6;
        System.out.println("Recursive Fib(" + recN + ") = " + fibRec + " in " + recTime + " ms");
    }
}
