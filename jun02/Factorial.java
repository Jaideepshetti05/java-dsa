package jun02;

public class Factorial {
    // 1. Recursive method
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // 2. Iterative method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 15;

        System.out.println("Calculating factorial of " + num);
        System.out.println("Recursive method: " + num + "! = " + factorialRecursive(num));
        System.out.println("Iterative method: " + num + "! = " + factorialIterative(num));
    }
}
